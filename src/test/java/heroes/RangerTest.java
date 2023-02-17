package heroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangerTest {

    Ranger ranger;

    @BeforeEach
    void setup() {
        ranger = new Ranger("Test");
    }

    @Test
    void testConstructor_ValidInput_ShouldGetCorrectName(){
        String expected = "Test";
        String actual = ranger.getName();

        assertEquals(expected,actual);
    }

    @Test
    void constructor_ValidInput_ShouldGetCorrectLevel(){
        int expected = 1;
        int actual = ranger.getLevel();
        assertEquals(expected,actual);
    }

    @Test
    void testConstructor_ValidInput_ShouldGetCorrectAttributes(){
        HeroAttributes expected= new HeroAttributes(1,7,1);
        HeroAttributes actual = ranger.getLevelAttributes();
        assertEquals(expected,actual);
    }

    @Test
    void testDisplay() {
    }

    @Test
    void testMage_LevelUp_ShouldGetCorrectLevel() {
        ranger.levelUp();
        int expected = 2;
        int actual = ranger.getLevel();
        assertEquals(expected,actual);
    }
    @Test
    void testMage_LevelUp_ShouldGetCorrectAttributes() {
        ranger.levelUp();
        HeroAttributes expected= new HeroAttributes(2,12,2);
        HeroAttributes actual = ranger.getLevelAttributes();
        assertEquals(expected,actual);
    }
}