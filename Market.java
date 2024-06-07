import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour,QueueBehaviour{
    private final List<Actor> queue;
    public Market(){
        this.queue=new ArrayList<>();
    }
    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " stood in line");
        this.queue.add(actor);
        
    }
    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " made order");
            }
        }
    }
    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " got order");
            }
        }
    }
    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors=new ArrayList<>();
        for (Actor actor : queue) {
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName()+" out of line and ready to leave");
            }
        }
        releaseFromMarket(releasedActors);
    }
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " came to market");
        takeInQueue(actor);
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " out of from market");
            
            
        }
        
    }
    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
        
}