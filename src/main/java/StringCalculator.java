public class StringCalculator {
    private  final  String delimeter=",|\n|;";
    public int Add(String numbers){
        if(numbers.startsWith("//")){
            int i=findindex(numbers);
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
           int result=getsum(arrays_number);

           return result;
       }


    }
    private int  findindex(String numbers){
        int i=0;
        while (true){
            if(numbers.charAt(i)=='1'){
                break;
            }
            i++;
        }
        return i;
    }
    private int getsum(String[] arrays_number){
        int result=0;
        for(int i=0;i<arrays_number.length;i++) {
            result =result+stringToInt(arrays_number[i]);
        }
        return result;
    }
    private int stringToInt(String numbers){
        return Integer.valueOf(numbers);
    }


}

