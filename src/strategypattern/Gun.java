package strategypattern;

public class Gun implements Weapon{

    @Override
    public void attack() {
        System.out.println("총 공격");
    }

    @Override
    public void repair() {
        System.out.println("총 수리");
    }
}
