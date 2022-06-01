import java.util.*;
import java.util.stream.Collectors;

public class FindTheOddInt {
    public static void main(String[] arg) {

//        int[] a = new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        int[] a = new int[]{1,1,2,-2,5,2,4,4,-1,-2,5};
        int[] unique = Arrays.stream(a).distinct().toArray();
        int answer = 0;

        for (Integer i: unique){
            int temp = 0;
            for( Integer j: a){
                if(j==i){
                    temp ++;
                }


            }
            if (temp %2 != 0) {
                answer = i;
            }
        }

        System.out.println(answer); // need to change it to return answer;
    }
}
