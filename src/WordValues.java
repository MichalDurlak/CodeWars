import java.util.ArrayList;
import java.util.Arrays;

public class WordValues {
    public static void main(String[] arg) {

        ArrayList alphabetList = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabetList.add(c);
        }

        String [] arr = {"zdcs","abc","xyz"}; // delete it
        int [] resultList = new int[arr.length];

        int multiple = 0;
        for (int j=0; j<arr.length; j++){
            int result = 0;
            multiple++;

            String input = arr[j];
            for (int i=0; i<input.length(); i++){

                    result += (alphabetList.indexOf(input.charAt(i)) + 1);
                    System.out.println(multiple + "*("+alphabetList.indexOf(input.charAt(i)) + "+"+ 1+")");
                }

            resultList[j] = result*multiple;
        }

        System.out.println(Arrays.toString(resultList)); /// change to return resultList;
    }
}
