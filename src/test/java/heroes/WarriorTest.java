package heroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    Warrior warrior;

    @BeforeEach
    void setup() {
        warrior = new Warrior("Test");
    }

    @Test
    void testConstructor_ValidInput_ShouldGetCorrectName(){
        String expected = "Test";
        String actual = warrior.getName();

        assertEquals(expected,actual);
    }

    @Test
    void constructor_ValidInput_ShouldGetCorrectLevel(){
        int expected = 1;
        int actual = warrior.getLevel();
        assertEquals(expected,actual);
    }

    @Test
    void testConstructor_ValidInput_ShouldGetCorrectAttributes(){
        HeroAttributes expected= new HeroAttributes(5,2,1);
        HeroAttributes actual = warrior.getLevelAttributes();
        assertEquals(expected,actual);
    }

    @Test
    void testDisplay() {
    }

    @Test
    void testMage_LevelUp_ShouldGetCorrectLevel() {
        warrior.levelUp();
        int expected = 2;
        int actual = warrior.getLevel();
        assertEquals(expected,actual);
    }
    @Test
    void testMage_LevelUp_ShouldGetCorrectAttributes() {
        warrior.levelUp();
        HeroAttributes expected= new HeroAttributes(8,4,2);
        HeroAttributes actual = warrior.getLevelAttributes();
        assertEquals(expected,actual);
    }

}