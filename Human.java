public class Human extends Actor {
    public Human(String name){
        super(name);
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder=isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder=isTakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
