import heroes.Mage;
import items.Slot;
import items.Weapon;
import items.WeaponType;

public class Main {
    static Mage mage = new Mage("Isabelle");
    static Weapon weapon = new Weapon("Axe", WeaponType.STAFF, 1, 3);

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(mage.damage());
        mage.display();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
        mage.levelUp();
       // mage.equip(weapon);
        mage.display();
       System.out.println(mage.damage());
        System.out.println(mage.getEquipment().get(Slot.WEAPON));
    }

    //TODO: write tests
    //TODO: protect/private as much as possible
    //TODO: fix error (unsafe operation in hero-class)
    //TODO: if time -> refactor
}