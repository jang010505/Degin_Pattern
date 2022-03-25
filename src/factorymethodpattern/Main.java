package factorymethodpattern;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.creat("장희권");
        Product card2 = factory.creat("장희건");

        card1.use();
        card2.use();
    }
}
