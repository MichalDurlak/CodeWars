import static java.lang.String.valueOf;

public class DescendingOrder {
    public static void main(String[] arg) {
        int input = 42145;

        String temp = valueOf(input);
        String temp1 = "";
        for (int i=9; i>-1; i--){
            for (int j=0; j<temp.length(); j++){
                if (i == Integer.parseInt(String.valueOf(temp.charAt(j)))){
                    temp1 += i;
                }
            }
        }
        System.out.println(temp1);
    }
}
