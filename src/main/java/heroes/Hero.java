package heroes;

import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.*;
import java.util.*;

public abstract class Hero {

    private final String name;

    private int level;


    protected HeroAttributes levelAttributes;


    protected Map<Slot, Item> equipment = new HashMap<>() ;

    private Set<WeaponType> validWeaponTypes=new HashSet<WeaponType>();

    private Set<Armor> validArmorTypes=new HashSet<Armor>();

    public Hero(String name, HeroAttributes heroAttributes, Set validWeaponTypes, Set validArmorTypes) {
        this.name = name;
        level = 1;
        //TODO: set equipment to null;
        this.levelAttributes = heroAttributes;
        this.validWeaponTypes = validWeaponTypes;
        this.validArmorTypes = validArmorTypes;
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.LEGS, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.WEAPON, null);
    }

    public abstract void levelUp();

    public void equip(Weapon weapon) {
        try {

            if (weapon.getRequiredLevel() > this.getLevel()) {
                throw new InvalidWeaponException("The weapons required level is higher than the heroes level");
            }
            if (!validWeaponTypes.contains(weapon.getWeaponType())) {
                throw new InvalidWeaponException("Invalid weaponType");
            }
            equipment.put(weapon.getSlot(), weapon);
        }
        catch (InvalidWeaponException e){
            System.out.println(e.getMessage());
        }
    }

    public void equip(Armor armor) {
        try {
            if (armor.getRequiredLevel() > this.getLevel()) {
                throw new InvalidArmorException("The armors required level is higher than the heroes level"); //TODO: fix a custom InvalidArmorException
            }
            if (!validArmorTypes.contains(armor.getArmorType())) {
                throw new InvalidArmorException("Invalid armorType");
            }
            equipment.put(armor.getSlot(), armor);
        }
        catch (InvalidArmorException e){
            System.out.println(e.getMessage());
        }
    }

    public double damage() {
        int weaponDamage;
        if (equipment.get(Slot.WEAPON) == null || equipment.get(Slot.WEAPON) instanceof Armor) {
            weaponDamage = 1;
        } else{
            Weapon a = (Weapon) equipment.get(Slot.WEAPON);
            weaponDamage = a.getWeaponDamage();
        }
        double heroDamage = weaponDamage * (1 + (totalAttributes().getDexterity() / 100));
        return heroDamage;
    }

    public HeroAttributes totalAttributes() {
        HeroAttributes total = new HeroAttributes(levelAttributes.getStrength(), levelAttributes.getDexterity(), levelAttributes.getIntelligence());
        for (Map.Entry<Slot, Item> entry : equipment.entrySet()) {
            if (entry.getValue() != null && entry.getValue() instanceof Armor) {
                total.add(((Armor) entry.getValue()).getArmorAttribute());
            }
        }
        return total;
    }

    public String display() {
        String nameString= "Name: " + this.name ;
        String classString= "Class: " + this.getClass().getSimpleName();
        String levelString= "Level: " + this.level;
        String heroAttributesString= "TotalStrength: " + this.totalAttributes().getStrength() + "\n" +
        "TotalDexterity: " + this.totalAttributes().getDexterity() + "\n" +
                "TotalIntelligence: " + this.totalAttributes().getIntelligence() ;
        String damageString=  "Damage: " + this.damage();
        String str = nameString + "\n" + classString  + "\n" + levelString  + "\n" + heroAttributesString + "\n" + damageString;
        return str;
    }
    public String getName() {
        return name;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public Map<Slot, Item> getEquipment() {
        return equipment;
    }
    public HeroAttributes getLevelAttributes() {
        return levelAttributes;
    }
}
