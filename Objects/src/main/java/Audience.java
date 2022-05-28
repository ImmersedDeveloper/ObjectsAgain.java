public class Audience {
    private Bag bag;

    public Audience(Bag bag) { // 관객은 소지품 보유
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
