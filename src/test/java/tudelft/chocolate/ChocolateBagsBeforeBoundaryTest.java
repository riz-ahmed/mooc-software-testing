package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {

    private ChocolateBags calc;
    @BeforeEach
    public void InitCalc(){

        this.calc = new ChocolateBags();
    }

    @Test
    public void NotEnoughBars(){

        int result = calc.calculate(1,1,6);

        Assertions.assertEquals(1, result);
    }

    @Test
    public void OnlyBigBars(){
        int result = calc.calculate(5, 3, 10);

        Assertions.assertEquals(0,result);
    }

    @Test
    public void BigAndSmallCombi(){
        int result = calc.calculate(1, 3, 17);

        Assertions.assertEquals(-1,result);
    }

    @Test
    public void OnlySmallBars(){
        int result = calc.calculate(5, 3, 4);

        Assertions.assertEquals(4,result);
    }
}
