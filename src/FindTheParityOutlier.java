import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FindTheParityOutlier {

    public static void main(String[] args) {

        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        FindOutlier.find(exampleTest1);
        FindOutlier.find(exampleTest2);
        FindOutlier.find(exampleTest3);
    }

    public class FindOutlier{
        static int find(int[] integers){
            ArrayList<Integer> oddNumbers = new ArrayList<>();
            ArrayList<Integer> evenNumbers = new ArrayList<>();
            for(int i : integers){
                if(i%2 == 0){
                    oddNumbers.add(i);
                } else {
                    evenNumbers.add(i);
                }


            }


            if(oddNumbers.size() == 1) { return oddNumbers.get(0);}
            else return evenNumbers.get(0);
        }}
}
