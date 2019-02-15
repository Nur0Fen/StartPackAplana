import org.junit.Test;
import Calc.Calc;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class DevideTest {


    @Test
    public void CheckOperationDiv() {
        Calc oper = new Calc();
        double actual= oper.divide();
        double expected = 2;
        assertThat(expected,equalTo(actual));
        System.out.println("деление отрабатывает корректно");

    }
}