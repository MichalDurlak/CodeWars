public class SimplePigLatin {
    // https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java

    public static void main(String[] args) {

        System.out.println(PigLatin.pigIt("Pig latin is cool"));
        //igPay atinlay siay oolcay
        System.out.println(PigLatin.pigIt("This is my string"));
        //hisTay siay ymay tringsay
    }

    public class PigLatin {
        public static String pigIt(String str) {
            String result ="";
            String[] splittedBySpace = str.split(" ");

            for(String s:splittedBySpace){
                if(s.length() == 1){
                    result += s;
                } else {
                    result+=s.substring(1,s.length());
                    result+=String.valueOf(s.charAt(0));
                    result+="ay ";
                }

            }

            return result.substring(0,result.length()-1);

        }
    }
}
