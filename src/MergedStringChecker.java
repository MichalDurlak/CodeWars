import java.util.SortedMap;

public class MergedStringChecker {
    // link = https://www.codewars.com/kata/54c9fcad28ec4c6e680011aa/train/java
    public static void main(String[] arg) {
        String s = "codewars";
        String part1 = "code";
        String part2 = "wars";

        String [] part1Table = part1.split("");
        String [] part2Table = part2.split("");
        boolean result = false;

        for (int i=0; i<part1Table.length; i++){
            s = s.replaceFirst(part1Table[i], "");
        }
        for (int i=0; i<part2Table.length; i++){
            s = s.replaceFirst(part2Table[i], "");
        }

        if(s.length() == 0){
            result = true;
        }

        System.out.println(result); // change to return result;

    }
}
