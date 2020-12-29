import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    StringCalculator sc=new StringCalculator();
    @Test
    public void emptyinput(){
        Assert.assertEquals(0,sc.Add(""));
    }
}
