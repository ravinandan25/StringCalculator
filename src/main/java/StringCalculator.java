public class StringCalculator {
    public int Add(String numbers){
        String[] arrays_number=numbers.split(",");
       if(numbers.isEmpty()){
           return 0;
       }
       if(arrays_number.length==1){
           return stringToInt(arrays_number[0]);
       }

       else {
           int result=0;
           for(int i=0;i<arrays_number.length;i++) {
               result =result+stringToInt(arrays_number[i]);
           }
           return result;
       }


    }
    private int stringToInt(String numbers){
        return Integer.valueOf(numbers);
    }


}

