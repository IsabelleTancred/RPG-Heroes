package heroes;

import items.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    Mage mage;

    @BeforeEach
    void setup() {
        mage = new Mage("Test");
    }

    @Test
    void testConstructor_ValidInput_ShouldGetCorrectName(){
    String expected = "Test";
    String actual = mage.getName();

    assertEquals(expected,actual);
    }

    @Test
    void constructor_ValidInput_ShouldGetCorrectLevel(){
        int expected = 1;
        int actual = mage.getLevel();
        assertEquals(expected,actual);
    }

    @Test
    void testConstructor_ValidInput_ShouldGetCorrectAttributes(){
        HeroAttributes expected= new HeroAttributes(1,1,8);
        HeroAttributes actual = mage.getLevelAttributes();
        assertEquals(expected,actual);
    }


    @Test
    void testMage_LevelUp_ShouldGetCorrectLevel() {
        mage.levelUp();
        int expected = 2;
        int actual = mage.getLevel();
        assertEquals(expected,actual);
    }
    @Test
    void testMage_LevelUp_ShouldGetCorrectAttributes() {
        mage.levelUp();
        HeroAttributes expected= new HeroAttributes(2,2,13);
        HeroAttributes actual = mage.getLevelAttributes();
        assertEquals(expected,actual);
    }

}