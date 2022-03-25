package strategypattern;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();

        character.attack();
        character.repair();

        character.setWeapon(new Sword());
        character.attack();
        character.repair();

        character.setWeapon(new Knife());
        character.attack();
        character.repair();

        character.setWeapon(new Gun());
        character.attack();
        character.repair();
    }
}
