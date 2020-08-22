import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicNumeralTest {

    @Test
    public void should_return_1_when_I(){
        ArabicNumeral arabicNumeral = new ArabicNumeral();
        assertThat(arabicNumeral.convert("I")).isEqualTo(1);
    }

    @Test
    public void should_return_2_when_II(){
        ArabicNumeral arabicNumeral = new ArabicNumeral();
        assertThat(arabicNumeral.convert("II")).isEqualTo(2);
    }

    @Test
    public void should_return_3_when_III(){
        ArabicNumeral arabicNumeral = new ArabicNumeral();
        assertThat(arabicNumeral.convert("III")).isEqualTo(3);
    }

    @Test
    public void should_return_4_when_IV(){
        ArabicNumeral arabicNumeral = new ArabicNumeral();
        assertThat(arabicNumeral.convert("IV")).isEqualTo(4);
    }

    @Test
    public void should_return_10_when_X(){
        ArabicNumeral arabicNumeral = new ArabicNumeral();
        assertThat(arabicNumeral.convert("X")).isEqualTo(10);
    }

    @Test
    public void should_return_20_when_XX(){
        ArabicNumeral arabicNumeral = new ArabicNumeral();
        assertThat(arabicNumeral.convert("XX")).isEqualTo(20);
    }

    @Test
    public void should_return_999_when_CMXCIX(){
        ArabicNumeral arabicNumeral = new ArabicNumeral();
        assertThat(arabicNumeral.convert("CMXCIX")).isEqualTo(999);
    }
}
