public class Main {
    public static void main(String[] args) {
        Market market=new Market();
        Human human1=new Human("Aidar");
        Human human2=new Human("Erbol");
        market.acceptToMarket(human2);
        market.takeInQueue(human1);
        market.update();
    }
    
}
