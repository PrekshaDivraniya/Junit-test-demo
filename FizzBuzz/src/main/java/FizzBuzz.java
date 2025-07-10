public class FizzBuzz {
    //divisible by 3 return Fizz
    //divisible by 5 return Buzz
    //divisible by 3 and 5 return FizzBuzz
    //otherwise return number that is inputed
    public Object returnFizzBuzz(int input){
        if(input <= 0){
            return input;
        }

        if(input % 3 == 0){
            if(input % 5 == 0) return "FizzBuzz";
            else return "Fizz";
        }else if(input % 5 == 0) return "Buzz";
        return input;
    }
}
