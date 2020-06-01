/**
 * LeapYear class to test if a given year is a leap year.
 */
public class LeapYear {

    //method that takes in an int and checks to if
    //it is a leap year.
    public static boolean checkIfLeapYear(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}