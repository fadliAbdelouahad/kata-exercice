import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearsTest {

    private LeapYears leapYears;

    @Before
    public void setUp(){
        leapYears = new LeapYears();
    }

    @Test
    public void return_true_when_divided_by_400(){
        assertThat(leapYears.isLeapYear(2000)).isTrue();
    }

    @Test
    public void return_false_when_1700(){
        assertThat(leapYears.isLeapYear(1700)).isFalse();
    }

    @Test
    public void return_true_when_2008(){
        assertThat(leapYears.isLeapYear(2008)).isTrue();
    }

    @Test
    public void return_false_when_2018(){
        assertThat(leapYears.isLeapYear(2018)).isFalse();
    }


    @Test
    public void return_false_when_year_is_typical_common_year() {
        assertThat(leapYears.isLeapYear(2001)).isFalse();
    }

    @Test
    public void return_true_when_year_is_a_typical_year() {
        assertThat(leapYears.isLeapYear(1996)).isTrue();
    }

    @Test
    public void return_false_when_year_is_an_atypical_common_year() {
        assertThat(leapYears.isLeapYear(1900)).isFalse();
    }

    @Test
    public void return_true_when_year_is_an_atypical_leap_year() {
        assertThat(leapYears.isLeapYear(2000)).isTrue();
    }
}
