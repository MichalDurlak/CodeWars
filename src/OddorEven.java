import java.util.ArrayList;
import java.util.stream.Stream;

public class OddorEven {

    public static void main(String[] args) {
        System.out.println(Codewars.oddOrEven(new int[] {2, 5, 34, 6}));
//        System.out.println(Codewars.oddOrEven(new int[] {774, 1244, 430, 1393, 469, 94, 787, 480, 69, 689, 1052, 1297, 1421, 1472, 843, 1608}));
//        System.out.println(Codewars.oddOrEven(new int[] {741, 841, 630, 661, 915, 1548, 504, 208}));
//        System.out.println(Codewars.oddOrEven(new int[] {226, 1258, 1430, 663, 1180, 290, 633, 392, 1449, 1719}));
//        System.out.println(Codewars.oddOrEven(new int[] {635, 98, 1154, 1685, 1533, 635, 887, 1393, 591, 122, 1370, 421, 962, 251}));


    }

    //copy and paste from FindTheParityOutlier

    public class Codewars {
        public static String oddOrEven (int[] array) {

            int result = 0;
            for(int i=0; i<array.length ; i++){
                result += array[i];
            }
            System.out.println(result);
            if (result%2 ==0){
                return "even";
            } else return "odd";

        }
        }
    }

