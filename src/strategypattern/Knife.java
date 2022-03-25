package strategypattern;

public class Knife implements Weapon{

    @Override
    public void attack() {
        System.out.println("칼 공격");
    }

    @Override
    public void repair() {
        System.out.println("칼 수리");
    }
}
