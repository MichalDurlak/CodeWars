import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConsonantValue {
    public static void main(String[] arg) {

        ArrayList alphabetList = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabetList.add(c);
        }

        // aeiou
        String input = "zodiacchruschtschovkhrushchevstrengthcatchphrasetwelfthstreetmischtschenkoanaazzozzfizzbuzzy"; //delete it
        String[] inputTable = input.split("[*aeiouy]");
        List<Integer> resultList = new ArrayList<Integer>();

        for(int i=0 ; i<inputTable.length; i++){

            if(inputTable[i].equals("")){

            } else {
                String inputTemp = inputTable[i];
                int countTemp = 0;
                for(int j=0;j<inputTemp.length(); j++){
                    countTemp += alphabetList.indexOf(inputTemp.charAt(j))+1;
                }
//                System.out.println(inputTemp + "->" + countTemp);
                resultList.add(countTemp);
            }

        }

//        System.out.println(Arrays.toString(resultList.toArray()));
        System.out.println(Collections.max(resultList)); // change to return Collections.max(resultList);

    }
}
