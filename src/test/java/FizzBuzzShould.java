import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import FizzBuzz.*;

public class FizzBuzzShould {

    @Test
    public void return_1_when_next_number_to_print_is_1(){
        String result = new FizzBuzz().evaluateNumber(1);

        assertThat(result).isEqualTo("1");
    }

    @Test
    public void return_2_when_next_number_to_print_is_2(){
        String result = new FizzBuzz().evaluateNumber(2);

        assertThat(result).isEqualTo("2");
    }
    

}
