import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
    private StringCalculator sc;

    @Before
    public void init(){
    sc=new StringCalculator();
    }
    @Test
    public void emptyinput(){

        Assert.assertEquals(0,sc.Add(""));
    }
    @Test
    public void input1number(){
        Assert.assertEquals(1,sc.Add("1"));
    }
}
