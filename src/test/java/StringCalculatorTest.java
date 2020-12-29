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
    @Test
    public void input2number(){
        Assert.assertEquals(3,sc.Add("1,2"));
    }
    @Test
    public void input_n_number(){
        Assert.assertEquals(15,sc.Add("1,2,3,4,5"));
    }
    @Test
    public void input_n_betweenNumbers(){
        Assert.assertEquals(6,sc.Add("1\n2,3"));
    }
    @Test
    public void inputdifferentdelimeter(){
        Assert.assertEquals(3,sc.Add("//;\\n1;2"));
    }

}
