import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import FizzBuzz.*;

public class FizzBuzzShould {

    @Test
    public void return_1_when_next_number_to_print_is_1(){
        String result = new FizzBuzz().printNumber();

        assertThat(result).isEqualTo("1");
    }

}
