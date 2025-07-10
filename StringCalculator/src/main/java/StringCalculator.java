public class StringCalculator {
//    public int add(String numbers){
//        return 0;
//    }

    public int addNumbersFromString(String numbers){
        if(numbers.isEmpty()) return 0;
        // to handle comma separated value like ("4,5")

        String[] tokens = numbers.split(",");
        int sum = 0;

        for(String token : tokens){
            sum += Integer.parseInt(token);
        }
        return sum;
    }
}
