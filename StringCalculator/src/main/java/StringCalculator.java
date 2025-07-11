public class StringCalculator {
//    public int add(String numbers){
//        return 0;
//    }

    public int addNumbersFromString(String numbers){
        if(numbers.isEmpty()) return 0;
        return getSummation(splitNumbers(numbers));
    }

    public String[] splitNumbers(String str){
        String tokens[] = str.split(",|\n|;");
        return tokens ;
    }

    public int getSummation(String[] allNumbers){
        int sum = 0;
        for(String number: allNumbers){
            int num = Integer.parseInt(number);
            checkNegative(num);
            if(num < 1000){
                sum += num;
            }
        }
        return sum;
    }

    public void checkNegative(int number){
        if(number < 0){
            throw new IllegalArgumentException("Negative NUmber is not allowed");
        }
        return;
    }
}
