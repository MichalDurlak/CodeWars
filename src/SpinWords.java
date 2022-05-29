import java.util.Arrays;

public class SpinWords {
    // link = https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
    public static void main(String[] arg) {
        String input = "Hey fellow warriors"; // need to change it to sentence;
        String[] inputTable = input.split(" ");
//        System.out.println(Arrays.toString(inputTable));
        String result = "";
        for (int i=0 ; i < inputTable.length; i++){
            String temp = inputTable[i];
                if(temp.length()>=5){
                    String reverse = new StringBuffer(temp).reverse().toString();
                    result += reverse+" ";
            } else {
                    result += temp+" ";
                }
        }
        System.out.println(result.substring(0,result.length()-1)); // change to return result.substring(0,result.length()-1);
    }
}
