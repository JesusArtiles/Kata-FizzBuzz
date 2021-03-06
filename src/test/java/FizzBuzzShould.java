import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import FizzBuzz.*;

public class FizzBuzzShould {


    @Test
    public void return_Fizz_when_next_number_to_print_is_divisible_by_3(){
        String result = new FizzBuzz().evaluateNumber(3);
        String result2 = new FizzBuzz().evaluateNumber(6);
        String result3 = new FizzBuzz().evaluateNumber(9);

        assertThat(result).isEqualTo("Fizz");
        assertThat(result2).isEqualTo("Fizz");
        assertThat(result3).isEqualTo("Fizz");
    }



    @Test
    public void return_Buzz_when_next_number_to_print_is_divisible_by_5(){
        String result = new FizzBuzz().evaluateNumber(5);
        String result2 = new FizzBuzz().evaluateNumber(10);
        String result3 = new FizzBuzz().evaluateNumber(20);

        assertThat(result).isEqualTo("Buzz");
        assertThat(result2).isEqualTo("Buzz");
        assertThat(result3).isEqualTo("Buzz");
    }

    @Test
    public void return_normal_number_when_number_is_not_divisible_by_3_or_5(){
        String result = new FizzBuzz().evaluateNumber(4);
        String result2 = new FizzBuzz().evaluateNumber(7);
        String result3 = new FizzBuzz().evaluateNumber(8);

        assertThat(result).isEqualTo("4");
        assertThat(result2).isEqualTo("7");
        assertThat(result3).isEqualTo("8");
    }

    @Test
    public void return_FizzBuzz_when_next_number_to_print_is_divisible_by_3_and_5(){
        String result = new FizzBuzz().evaluateNumber(15);
        String result2 = new FizzBuzz().evaluateNumber(30);
        String result3 = new FizzBuzz().evaluateNumber(60);

        assertThat(result).isEqualTo("FizzBuzz");
        assertThat(result2).isEqualTo("FizzBuzz");
        assertThat(result3).isEqualTo("FizzBuzz");
    }




}
