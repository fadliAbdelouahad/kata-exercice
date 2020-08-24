public class LeapYears {
    public boolean isLeapYear(int year) {
        boolean res = false;
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            res = true;
        }
        return res;
    }
}
