package heroes;

import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import items.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    Mage mage;
    Weapon validWeapon;
    Weapon replacedWeapon;
    Weapon highLevelWeapon;
    Weapon wrongWeaponType;

    Armor validArmor;
    Armor secondValidArmor;
    Armor replacedArmor;
    Armor highLevelArmor;
    Armor wrongArmorType;

    @BeforeEach
    void setup() {
        mage = new Mage("Test");
        validWeapon = new Weapon("ValidWeapon", WeaponType.STAFF, 1, 3);
        replacedWeapon = new Weapon("ReplacedWeapon", WeaponType.STAFF, 1, 5);
        highLevelWeapon = new Weapon("HighLevelWeapon", WeaponType.STAFF, 5, 3);
        wrongWeaponType = new Weapon("WrongTypeWeapon", WeaponType.AXE, 1, 3);
        validArmor = new Armor("ValidArmor", ArmorType.CLOTH,1, Slot.BODY, new HeroAttributes(1,1,100));
        secondValidArmor = new Armor("SecondValidArmor", ArmorType.CLOTH,1, Slot.HEAD, new HeroAttributes(1,1,1));
        replacedArmor = new Armor("ReplacedArmor",ArmorType.CLOTH,1, Slot.BODY, new HeroAttributes(2,2,2));
        highLevelArmor = new Armor("HighLevelArmor", ArmorType.CLOTH,3, Slot.BODY, new HeroAttributes(1,1,1));
        wrongArmorType = new Armor("ValidArmor", ArmorType.LEATHER,1, Slot.BODY, new HeroAttributes(1,1,1));
    }
    @Test
    void testEquip_ValidWeapon_ShouldPass() {
        mage.equip(validWeapon);
        String expected = "ValidWeapon";
        String actual = mage.getEquipment().get(Slot.WEAPON).getName();
        assertEquals(expected,actual);
    }

        @Test
        void testEquip_WeaponWithTooHighLevel_ShouldRaiseInvalidWeaponException() {
            String expected = "The weapons required level is higher than the heroes level";
            Exception exception = assertThrows(InvalidWeaponException.class,
                    () -> mage.equip(highLevelWeapon));
            String actual = exception.getMessage();
            assertEquals(expected,actual);
        }



        @Test
        void testEquip_InvalidWeaponType_ShouldRaiseInvalidWeaponException() {
            String expected = "Invalid weaponType";
            Exception exception = assertThrows(InvalidWeaponException.class,
                    () -> mage.equip(wrongWeaponType));
            String actual = exception.getMessage();
            assertEquals(expected,actual);
        }

        @Test
        void testEquip_ValidArmor_ShouldPass() {
            mage.equip(validArmor);
            String expected = "ValidArmor";
            String actual = mage.getEquipment().get(Slot.BODY).getName();
            assertEquals(expected,actual);
        }

        @Test
        void testEquip_ArmorWithTooHighLevel_ShouldRaiseInvalidArmorException() {
            String expected = "The armors required level is higher than the heroes level";
            Exception exception = assertThrows(InvalidArmorException.class,
                    () -> mage.equip(highLevelArmor));
            String actual = exception.getMessage();
            assertEquals(expected,actual);
        }
        @Test
        void testEquip_InvalidArmorType_ShouldRaiseInvalidArmorException() {
            String expected = "Invalid armorType";
            Exception exception = assertThrows(InvalidArmorException.class,
                    () -> mage.equip(wrongArmorType));
            String actual = exception.getMessage();
            assertEquals(expected,actual);
        }

    @Test
    void testMage_TotalAttributesNoArmor_ShouldGetCorrectAttributes(){
        HeroAttributes expected =new HeroAttributes(1,1,8);
        HeroAttributes actual= mage.totalAttributes();
        assertEquals(expected,actual);
    }

    @Test
    void testMage_TotalAttributesOneArmor_ShouldGetCorrectAttributes(){
        mage.equip(validArmor);
        HeroAttributes expected =new HeroAttributes(2,2,108);
        HeroAttributes actual= mage.totalAttributes();
        assertEquals(expected,actual);
    }

    @Test
    void testMage_TotalAttributesTwoArmor_ShouldGetCorrectAttributes(){
        mage.equip(validArmor);
        mage.equip(secondValidArmor);
        HeroAttributes expected =new HeroAttributes(3,3,109);
        HeroAttributes actual= mage.totalAttributes();
        assertEquals(expected,actual);
    }

    @Test
    void testMage_TotalAttributesReplacedArmor_ShouldGetCorrectAttributes(){
        mage.equip(validArmor);
        mage.equip(replacedArmor);
        HeroAttributes expected =new HeroAttributes(3,3,10);
        HeroAttributes actual= mage.totalAttributes();
        assertEquals(expected, actual);
    }


    @Test
    void testMage_DamageNoWeapon_ShouldGetCorrectAttributes(){
        double expected = 1.0;
        double actual = mage.damage();
        assertEquals(expected, actual);
    }


    @Test
    void testMage_DamageWithWeapon_ShouldGetCorrectAttributes(){
        mage.equip(validWeapon);
        double expected = 3.0;
        double actual = mage.damage();
        assertEquals(expected, actual);
    }

    @Test
    void testMage_DamageWithReplacedWeapon_ShouldGetCorrectAttributes(){
        mage.equip(validWeapon);
        mage.equip(replacedWeapon);
        double expected = 5.0;
        double actual = mage.damage();
        assertEquals(expected, actual);
    }

    @Test
    void testMage_DamageWithWeaponAndArmor_ShouldGetCorrectAttributes(){
        mage.equip(validWeapon);
        mage.equip(validArmor);
        double expected = 6.0;
        double actual = mage.damage();
        assertEquals(expected, actual);
    }
    @Test
    void testMage_Display_ShouldShowCorrectStats() {
        String expected = "Name: Test" + "\n" + "Class: Mage"  + "\n" + "Level: 1"  + "\n" +
                "TotalStrength: 1" + "\n" + "TotalDexterity: 1" + "\n" +  "TotalIntelligence: 8" + "\n" + "Damage: 1.0" ;
        String actual = mage.display();
        assertEquals(expected, actual);
    }

}