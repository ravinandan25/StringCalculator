public class StringCalculator {
    private  final  String delimeter=",|\n|;";
    public int Add(String numbers){
        if(numbers.startsWith("//")){
            int i=0;
            while (true){
                if(numbers.charAt(i)=='1'){
                    break;
                }
                i++;
            }
            numbers=numbers.substring(i,numbers.length());
        }
        String[] arrays_number=numbers.split(delimeter);
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

