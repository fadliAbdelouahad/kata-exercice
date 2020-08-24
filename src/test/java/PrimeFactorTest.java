import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorTest {

    private PrimeFactor primeFactor;

    @Before
    public void setUp(){
        primeFactor = new PrimeFactor();
    }
    @Test
    public void should_return_empty_when_1(){
        assertThat(primeFactor.generate(1)).isEmpty();
    }

    @Test
    public void should_return_2_when_2(){
        assertThat(primeFactor.generate(2)).isEqualTo(Lists.newArrayList(2));
    }


    @Test
    public void should_return_3_when_3(){
        assertThat(primeFactor.generate(3)).isEqualTo(Lists.newArrayList(3));
    }

    @Test
    public void should_return_2_2_when_4(){
        assertThat(primeFactor.generate(4)).isEqualTo(Lists.newArrayList(2,2));
    }

    @Test
    public void should_return_2_3_when_6(){
        assertThat(primeFactor.generate(6)).isEqualTo(Lists.newArrayList(2,3));
    }

    @Test
    public void should_return_2_2_2_when_8(){
        assertThat(primeFactor.generate(8)).isEqualTo(Lists.newArrayList(2,2,2));
    }

    @Test
    public void should_return_3_3_when_9(){
        assertThat(primeFactor.generate(9)).isEqualTo(Lists.newArrayList(3,3));
    }

    @Test
    public void acceptance_test(){
        assertThat(primeFactor.generate(2*2*3*5)).isEqualTo(Lists.newArrayList(2,2,3,5));
    }
}
