package heroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RogueTest {
    Rogue rogue;

    @BeforeEach
    void setup() {
        rogue = new Rogue("Test");
    }

    @Test
    void testConstructor_ValidInput_ShouldGetCorrectName(){
        String expected = "Test";
        String actual = rogue.getName();

        assertEquals(expected,actual);
    }

    @Test
    void constructor_ValidInput_ShouldGetCorrectLevel(){
        int expected = 1;
        int actual = rogue.getLevel();
        assertEquals(expected,actual);
    }

    @Test
    void testConstructor_ValidInput_ShouldGetCorrectAttributes(){
        HeroAttributes expected= new HeroAttributes(2,6,1);
        HeroAttributes actual = rogue.getLevelAttributes();
        assertEquals(expected,actual);
    }

    @Test
    void testDisplay() {
    }

    @Test
    void testMage_LevelUp_ShouldGetCorrectLevel() {
        rogue.levelUp();
        int expected = 2;
        int actual = rogue.getLevel();
        assertEquals(expected,actual);
    }
    @Test
    void testMage_LevelUp_ShouldGetCorrectAttributes() {
        rogue.levelUp();
        HeroAttributes expected= new HeroAttributes(3,10,2);
        HeroAttributes actual = rogue.getLevelAttributes();
        assertEquals(expected,actual);
    }
}