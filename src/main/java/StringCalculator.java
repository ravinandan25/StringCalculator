public class StringCalculator {
    public int Add(String numbers){
        String[] arrays_number=numbers.split(",");
       if(numbers.isEmpty()){
           return 0;
       }
       if(numbers.length()==1){
           return stringToInt(numbers);
       }
       else{
           return sumof2numbers(arrays_number[0],arrays_number[1]);

       }


    }
    private int stringToInt(String numbers){
        return Integer.valueOf(numbers);
    }
    private int sumof2numbers(String number1 ,String number2){
        return Integer.valueOf(number1)+Integer.valueOf(number2);
    }

}

