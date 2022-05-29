import java.util.*;

public class FilteringEvenNumbers_BugFixes {
    public static void main(String[] arg) {
//        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4, 5, 6, 7 ));
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 )); // delete it

        ArrayList output = new ArrayList();
        for (int i = 0; i < listOfNumbers.size(); i++)
        {

            if (listOfNumbers.get(i)%2 != 0)
            {
                output.add(listOfNumbers.get(i));

            }
        }
        System.out.println(output); // change it to return output;
    }
}
