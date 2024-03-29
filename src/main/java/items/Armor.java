package items;

import heroes.HeroAttributes;

public class Armor extends Item {

    private ArmorType armorType;

    HeroAttributes armorAttribute;
    public Armor(String name, ArmorType armorType, int requiredLevel , Slot slot, HeroAttributes armorAttribute){
        this.name=name;
        this.armorType=armorType;
        this.setRequiredLevel(requiredLevel);
        this.slot=slot;
        this.armorAttribute=armorAttribute;
    }

    public ArmorType getArmorType() {
        return armorType;
    }
    public HeroAttributes getArmorAttribute() {
        return armorAttribute;
    }

}