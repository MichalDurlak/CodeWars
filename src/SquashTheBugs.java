public class SquashTheBugs {
    public static void main(String[] arg) {
        String str = "The quick white fox jumped around the massive dog";
        String[] spl = str.split(" ");
        int longest = 0;

        for (int i=0; i<spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
            }
        System.out.println(longest);
//            return longest;

    }
}
