public class StringCalculator {
    private  final  String delimeter=",|\n|;";
    public int Add(String numbers) throws Exception {

        if(numbers.startsWith("//")){
            numbers=findindex(numbers);

        }
        String[] arrays_number=numbers.split(delimeter);
       if(numbers.isEmpty()){
           return 0;
       }
        for(String current:arrays_number){
            if(stringToInt(current)<0){
                throw new Exception("negatives not allowed");
            }
        }
       if(arrays_number.length==1){
           return stringToInt(arrays_number[0]);
       }

       else {
           return getsum(arrays_number);
       }


    }
    private String  findindex(String numbers){
        int i=0;
        while (true){
            if(numbers.charAt(i)=='1'){
                break;
            }
            i++;
        }
        return numbers.substring(i,numbers.length());
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

