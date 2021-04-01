import lessons.lesson12Interfaces.CalculatorDrob;
import lessons.lesson12Interfaces.FractionNumber;
import lessons.lesson12Interfaces.FractionNumberImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionNumberTest {
    @Test
    public void add1(){ // появилась точка старта как в psvm

        FractionNumberImpl num1 = new FractionNumberImpl(2,5);
        FractionNumberImpl num2 = new FractionNumberImpl(1,7);
        CalculatorDrob utils = new CalculatorDrob();
        FractionNumber resultFact= utils.add (num1, num2);
        FractionNumberImpl resultTrue = new FractionNumberImpl(19,35);
        assertEquals(resultFact, resultTrue);

    }

}
