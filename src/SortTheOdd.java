import java.util.ArrayList;
import java.util.Collections;

public class SortTheOdd {

    public static void main(String[] args) {
        System.out.println(Kata.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
        System.out.println(Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4}));

        }

    public class Kata {
        public static int[] sortArray(int[] array) {
            ArrayList oddList = new ArrayList();
            for(int a : array){
                if(a%2 != 0){
                    oddList.add(a);
                }
            }
            Collections.sort(oddList);
            ArrayList resultList = new ArrayList();
            int numberTemp = 0;
            for(int i=0 ; i<array.length ; i++){
                if(array[i]%2 ==0){
                    resultList.add(array[i]);
                } else {
                    resultList.add(oddList.get(numberTemp));
                    numberTemp++;
                }
            }
            int[] arr = resultList.stream().mapToInt(i -> (int) i).toArray();

            return arr;
        }
    }
}
