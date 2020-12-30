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
    public void emptyInput() throws Exception {

        Assert.assertEquals(0,sc.Add(""));
    }
    @Test
    public void input1number() throws Exception {
        Assert.assertEquals(1,sc.Add("1"));
    }
    @Test
    public void input2number() throws Exception {
        Assert.assertEquals(3,sc.Add("1,2"));
    }
    @Test
    public void input_n_number() throws Exception {
        Assert.assertEquals(15,sc.Add("1,2,3,4,5"));
    }
    @Test
    public void input_n_betweenNumbers() throws Exception {
        Assert.assertEquals(6,sc.Add("1\n2,3"));
    }
    @Test
    public void inputDifferentDel() throws Exception {
        Assert.assertEquals(3,sc.Add("//;\\n1;2"));
    }
    @Test(expected = Exception.class)
    public void negativeInputException() throws Exception {
       sc.Add("-2");
      // Assert.assertEquals("negatives not allowed:[-1 -3]",String.valueOf(sc.Add("-1")));
    }
    @Test
    public void biggerThanThousand() throws Exception {

        Assert.assertEquals(2,sc.Add("2,1001"));
    }
    @Test
    public void delimiterOfAnyLengthWithFixedFormat() throws Exception {

        Assert.assertEquals(6,sc.Add("//[***]\\n1***2***3"));
    }
    @Test
    public void multipleDelimiter() throws Exception {

        Assert.assertEquals(6,sc.Add("//[*][%]\\n1*2%3"));
    }

}
