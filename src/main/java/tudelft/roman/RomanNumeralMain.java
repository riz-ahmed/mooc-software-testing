package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralMain {

    @Test
    void singleNUmber(){
        RomanNumeral roman = new RomanNumeral();            // create RomanNumeral class instance
        int result =  roman.convert("I");               // invoke roman class methods and store result in new variable

        Assertions.assertEquals(1, result);
    }

    @Test
    void testWithMoreNumbers(){
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");

        Assertions.assertEquals(8, result);
    }

    @Test
    void testWithSubNumbers(){
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");

        Assertions.assertEquals(4, result);
    }
}