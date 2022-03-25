package strategypattern;

public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("검 공격");
    }

    @Override
    public void repair() {
        System.out.println("검 수리");
    }
}
