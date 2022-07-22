import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Mumbling {

    public static void main(String[] args) {
        System.out.println(Accumul.accum("ZpglnRxqenU"));


    }


    public class Accumul {

        public static String accum(String s) {

            String result = "";


            for(int i=0; i<s.length(); i++){
                result += String.valueOf(s.charAt(i)).toUpperCase();

                for(int j=i; j>=1 ; j--){
                    result += String.valueOf(s.charAt(i)).toLowerCase();
                }

                result += "-";
            }



            return result.substring(0,result.length()-1);
        }
    }
}
