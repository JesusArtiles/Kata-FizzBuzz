package FizzBuzz;

public class FizzBuzz {

    public String evaluateNumber(Integer number){
        if(number%3 == 0) return "Fizz";
        else return number.toString();
    }
}
