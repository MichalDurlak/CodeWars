import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ValidBraces {
    public static void main(String[] arg) {
// not working correctly
        String input = ")(}{][" ;


        ArrayList auxiliaryList = new ArrayList();

        for(int i=0; i<input.length(); i++){

                String value = String.valueOf(input.charAt(i));
                if (value.equals("(") || value.equals(")")){
                    auxiliaryList.add(1);
                } else if(value.equals("{") || value.equals("}")){
                    auxiliaryList.add(2);
                } else if(value.equals("[") || value.equals("]")){
                    auxiliaryList.add(3);
                }
        }

        boolean result = true;
        for (int i=0; i< auxiliaryList.size(); i++){
            int first = (int)auxiliaryList.get(i);
//            System.out.println(auxiliaryList + " i-> " + i + " first -> " + first);
            if(first == (int)auxiliaryList.get(1)){
                auxiliaryList.remove(1);
            }
            else if (first == (int)auxiliaryList.get(auxiliaryList.size()-1)){
                auxiliaryList.remove(auxiliaryList.size()-1);
            } else {
                result ^= true;
            }
        }

//        System.out.println(auxiliaryList);
        System.out.println(result); // change to return result;


    }

}
