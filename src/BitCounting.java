public class BitCounting {
//link = https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
    public static void main(String[] arg) {

        int input = 1234;
//        System.out.println(Integer.bitCount(input)); // didnt know about that
        int output = 0;
        //need to change the loop to lowest values
        for (int i=0; i<100; i++){

            switch(input%2){
                case 0:
                    input /= 2;
                    break;

                default:
                    input--;
                    output++;
                    break;
            }

        }

        System.out.println(output);


    }
}
