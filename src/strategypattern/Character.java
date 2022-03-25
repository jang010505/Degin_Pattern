package strategypattern;

public class Character {
    private Weapon weapon;

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        if(weapon == null)
            System.out.println("맨손 공격");
        else
            weapon.attack();
    }

    public void repair(){
        if(weapon == null)
            System.out.println("수리 대상 없음");
        else
            weapon.repair();
    }
}
