package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/*Boundary value testing for the chocolate bar's calculation problem*/

public class ChocolateBagsTest {

    private ChocolateBags calc;

    @BeforeEach
    public void Initialisation(){this.calc = new ChocolateBags();}

    @ParameterizedTest
    @CsvSource({"1,1,5,0", "1,1,6,1", "1,1,7,-1", "1,1,8,-1"})
    public void totalTooBig(int small, int big, int total, int expected){
        int result = calc.calculate(small, big, total);

        Assertions.assertEquals(expected,result);
    }
    @ParameterizedTest
    @CsvSource({"5,0,10,-1", "5,1,10,5", "5,2,10,0", "5,3,10,0"})
    public void OnlyBigBars(int small, int big, int total, int expected){
        int result = calc.calculate(small, big, total);

        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @CsvSource({"4,2,3,3", "3,2,3,3", "2,2,3,-1", "1,2,3,-1"})
    public void OnlySmallBars(int small, int big, int total, int expected){
        int result = calc.calculate(small, big, total);

        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @CsvSource({"0,3,17,-1", "1,3,17,-1", "2,3,17,2", "3,3,17,2", "0,3,12,-1", "1,3,12,-1", "2,3,12,2", "3,3,12,2"})
    public void BigAndSmallBars(int small, int big, int total, int expected){
        int result = calc.calculate(small, big, total);

        Assertions.assertEquals(expected,result);
    }
}
