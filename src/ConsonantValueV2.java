import java.util.ArrayList;

public class ConsonantValueV2 {
    public static void main(String[] arg) {

        ArrayList alphabetList = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabetList.add(c);
        }

        String input = "zodiac"; // need to change to String input = s;
        input = input.replaceAll("[aeiou]+",",");
        String[] splitedInput = input.split(",");
        int result = 0;
        for(String i: splitedInput){
            int temp=0;
            for(int j=0 ; j<i.length();j++){

                temp += alphabetList.indexOf(i.charAt(j))+1;
            }

            if (temp > result){
                result = temp;
            }

        }

        System.out.println(result); // change to return result;


    }
}
