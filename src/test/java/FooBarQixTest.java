import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FooBarQixTest {

    @Test
    public void return_1_when1(){
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(1)).isEqualTo("1");
    }

    @Test
    public void return_2_when2(){
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(2)).isEqualTo("2");
    }

    @Test
    public void return_Foo_when_6(){
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(6)).isEqualTo("Foo");
    }

    @Test
    public void return_Foo_when_13(){
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(13)).isEqualTo("Foo");
    }

    @Test
    public void return_FooFoo_when_3(){
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(3)).isEqualTo("FooFoo");
    }

    @Test
    public void return_Bar_when_10(){
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(10)).isEqualTo("Bar");
    }

    @Test
    public void return_BarBar_when_5(){
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(5)).isEqualTo("BarBar");
    }

    @Test
    public void return_FooBarBar_when_15(){
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(15)).isEqualTo("FooBarBar");
    }

    @Test
    public void return_regular_number_when_regular_number_given_1_case() {
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(1)).isEqualTo("1");
    }

    @Test
    public void return_regular_number_when_regular_number_given_2_case() {
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(2)).isEqualTo("2");
    }

    @Test
    public void return_foofoo_when_number_is_divisible_by_3_and_contains_3() {
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(3)).isEqualTo("FooFoo");
    }

    @Test
    public void return_barbar_when_number_is_divisible_by_5_and_contains_5() {
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(5)).isEqualTo("BarBar");
    }

    @Test
    public void return_qixqix_when_number_is_divisible_by_7_and_contains_7() {
        FooBarQix fooBarQix = new FooBarQix();
        assertThat(fooBarQix.generate(7)).isEqualTo("QixQix");
    }
}
