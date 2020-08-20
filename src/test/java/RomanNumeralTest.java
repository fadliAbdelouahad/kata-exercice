import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RomanNumeralTest {

    private RomanNumeral romanNumeral;

    @Before
    public void setUp(){
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void should_return_I_when_1(){
        assertThat(romanNumeral.convert(1)).isEqualTo("I");
    }

    @Test
    public void should_return_II_when_2(){
        assertThat(romanNumeral.convert(2)).isEqualTo("II");
    }

    @Test
    public void should_return_III_when_3(){
        assertThat(romanNumeral.convert(3)).isEqualTo("III");
    }

    @Test
    public void should_return_V_when_5(){
        assertThat(romanNumeral.convert(5)).isEqualTo("V");
    }

    @Test
    public void should_return_VII_when_7(){
        assertThat(romanNumeral.convert(7)).isEqualTo("VII");
    }

    @Test
    public void should_return_X_when_10(){
        assertThat(romanNumeral.convert(10)).isEqualTo("X");
    }

    @Test
    public void should_return_XX_when_20(){
        assertThat(romanNumeral.convert(20)).isEqualTo("XX");
    }

    @Test
    public void should_return_XXII_when_22(){
        assertThat(romanNumeral.convert(22)).isEqualTo("XXII");
    }


    @Test
    public void should_return_MDLV_when_1555(){
        assertThat(romanNumeral.convert(1555)).isEqualTo("MDLV");
    }

    @Test
    public void should_return_MMCMLIV_when_2954(){
        assertThat(romanNumeral.convert(2954)).isEqualTo("MMCMLIV");
    }
}
