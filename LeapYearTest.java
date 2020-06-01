import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {
    
    //Test if given year is divisible by 4
    @Test
    public void isDivisibleBy4() {
        Assert.assertEquals(true, LeapYear.checkIfLeapYear(2024));
        Assert.assertEquals(false, LeapYear.checkIfLeapYear(1893));
    }

    //Test if the the given year is divisible by 100 and then
    //also if it is divisible by 400.
    @Test
    public void isDivisibleBy100AndAlso400() {
        Assert.assertEquals(true, LeapYear.checkIfLeapYear(2000));
        Assert.assertEquals(false, LeapYear.checkIfLeapYear(1500));
    }

}