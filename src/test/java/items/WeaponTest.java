package items;

import heroes.Mage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {
    Weapon weapon;

    @BeforeEach
    void setup() {
        weapon = new Weapon("Test",WeaponType.AXE,2,2);
    }

    @Test
    void testConstructor_ValidInput_ShouldGetCorrectName(){
        String expected = "Test";
        String actual = weapon.getName();

        assertEquals(expected,actual);
    }

    @Test
    void constructor_ValidInput_ShouldGetCorrectType(){
        WeaponType expected = WeaponType.AXE;
        WeaponType actual = weapon.getWeaponType();
        assertEquals(expected,actual);
    }


    @Test
    void constructor_ValidInput_ShouldGetCorrectLevel(){
        int expected = 2;
        int actual = weapon.getRequiredLevel();
        assertEquals(expected,actual);
    }
    @Test
    void constructor_ValidInput_ShouldGetCorrectDamage(){
        int expected = 2;
        int actual = weapon.getWeaponDamage();
        assertEquals(expected,actual);
    }
    @Test
    void constructor_ValidInput_ShouldGetCorrectSlot(){
        Slot expected = Slot.WEAPON;
        Slot actual = weapon.getSlot();
        assertEquals(expected,actual);
    }


}