import static java.lang.String.valueOf;

public class SquareEverDigit {
    public static void main(String[] arg) {
        int input = 919;
        // output = 12445;
        String temp = valueOf(input);
        String temp2 = "" ;
        for(int i=0 ; i < temp.length() ; i++){
            temp2 += (int)Math.pow((Integer.parseInt(valueOf(temp.charAt(i)))),2);
        }




        System.out.println(temp2);
    }
}
