public class SumOfDigits_DigitalRoot {
    // link = https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
    public static void main(String[] arg) {

        int input = 493193 ; // need to change it to int input = n;



        while (input >= 10){
            int inputTemp = 0;
            for(int i=0; i<= String.valueOf(input).length()-1; i++){
//                System.out.println(String.valueOf(input).charAt(i));
                inputTemp += Integer.parseInt(String.valueOf(String.valueOf(input).charAt(i)));
            }
            input = inputTemp;
        }

        System.out.println(input); //need to change it to return input;
    }
}
