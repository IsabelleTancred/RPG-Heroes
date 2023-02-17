package items;

public class Weapon extends Item {

    WeaponType weaponType;
    private int weaponDamage;

    public Weapon(String name, WeaponType weaponType, int requiredLevel, int weaponDamage){
        this.name=name;
        this.weaponType=weaponType;
        this.setRequiredLevel(requiredLevel);
        this.weaponDamage=weaponDamage;
        slot= Slot.WEAPON;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }
    public WeaponType getWeaponType() {
        return weaponType;
    }

}
