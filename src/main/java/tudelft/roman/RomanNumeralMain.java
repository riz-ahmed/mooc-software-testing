package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralMain {

    private RomanNumeral roman;                             // a global var within this class with private access
    @BeforeEach                                             // this is like using fixtures in pytest
    public void intialise(){
        this.roman = new RomanNumeral();
    }

    @Test
    void singleNUmber(){

        int result =  roman.convert("I");               // invoke roman class methods and store result in new variable

        Assertions.assertEquals(1, result);
    }

    @Test
    void testWithMoreNumbers(){

        int result = roman.convert("VIII");

        Assertions.assertEquals(8, result);
    }

    @Test
    void testWithSubNumbers(){

        int result = roman.convert("IV");

        Assertions.assertEquals(4, result);
    }
}