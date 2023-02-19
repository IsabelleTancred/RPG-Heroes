package heroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroAttributesTest {



    @Test
    void add_twoDifferentHeroAttributes_ShouldSumCorrectly(){
        HeroAttributes attributes1 = new HeroAttributes(1,1,1);
        HeroAttributes attributes2= new HeroAttributes(2,2,2);
        attributes1.add(attributes2);
        HeroAttributes expected = new HeroAttributes(3,3,3);
        HeroAttributes actual = attributes1;
        assertEquals(expected,actual);
    }

}