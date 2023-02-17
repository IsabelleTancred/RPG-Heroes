package items;

import heroes.HeroAttributes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {

    Armor armor;

    @BeforeEach
    void setup() {
        armor = new Armor("Test",ArmorType.MAIL,2, Slot.BODY,new HeroAttributes(1,1,1));
    }

    @Test
    void testConstructor_ValidInput_ShouldGetCorrectName(){
        String expected = "Test";
        String actual = armor.getName();
        assertEquals(expected,actual);
    }

    @Test
    void constructor_ValidInput_ShouldGetCorrectType(){
        ArmorType expected = ArmorType.MAIL;
        ArmorType actual = armor.getArmorType();
        assertEquals(expected,actual);
    }

    @Test
    void constructor_ValidInput_ShouldGetCorrectLevel(){
        int expected = 2;
        int actual = armor.getRequiredLevel();
        assertEquals(expected,actual);
    }

    @Test
    void constructor_ValidInput_ShouldGetCorrectSlot(){
        Slot expected = Slot.BODY;
        Slot actual = armor.getSlot();
        assertEquals(expected,actual);
    }

}