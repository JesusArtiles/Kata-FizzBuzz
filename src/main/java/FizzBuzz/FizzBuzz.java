package FizzBuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1;i < 101;i++){
            System.out.println(evaluateNumber(i));
        }
    }

    public static String evaluateNumber(Integer number){
        if(number%3 == 0 && number%5 == 0) return "FizzBuzz";
        else if(number%3 == 0) return "Fizz";
        else if(number%5 == 0) return "Buzz";
        else return number.toString();
    }

}
