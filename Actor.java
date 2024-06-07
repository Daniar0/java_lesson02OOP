public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    public Actor(String name) {
        this.name = name;
    }
    public abstract String getName();

}