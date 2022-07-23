import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertYourNameToJapaneseGame {

    public static void main(String[] args) {


//        System.out.println(JapaneseName.asciiConvertToJapanese("Ruslan López"));
//        System.out.println(JapaneseName.asciiConvertToJapanese("Ruslan LópezRuslan Lopez"));
        System.out.println(JapaneseName.asciiConvertToJapanese(""));

    }

    public class JapaneseName {

        static String[] alphabet = new String[]{
                "ka", "zu", "mi", "te", "ku",
                "lu", "ji", "ri", "ki", "zusu",
                "me", "ta", "rin", "to", "mo",
                "no", "ke", "shi", "ari", "chi",
                "do", "ru", "mei", "na", "fu", "zi"
        };

         static String asciiConvertToJapanese(String name) {
             String result = "";
             char[] alphabetEng = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            if (name == null ){
                return "a";
            } else {
                try {
                    boolean isUppercase = false;
                    for(int i=0 ; i<name.length() ; i++){

                        if(name.charAt(i) == ' '){
                            result += " ";
                            isUppercase = true;
                        } else {
                            int numberInAlphabetEng = Arrays.binarySearch(alphabetEng, name.toLowerCase().charAt(i));
                            if(isUppercase == true){
                                String tempLetter = alphabet[numberInAlphabetEng];
                                result += tempLetter.substring(0,1).toUpperCase() + tempLetter.substring(1);
                                isUppercase = false;
                            } else {
                                result += alphabet[numberInAlphabetEng];

                            }



                        }
                    }
                    result = result.substring(0,1).toUpperCase()+result.substring(1);
                } catch (Exception e){


                    result = "Only ASCII";

                }


                return result;

            }
         }
    }
}
