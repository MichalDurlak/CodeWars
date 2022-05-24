import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {
    // link = https://www.codewars.com/kata/583203e6eb35d7980400002a/train/java

    public static void main(String[] arg) {
        List<String> arr =  new ArrayList<String>();
//        arr.add(":)"); arr.add(":)"); arr.add("x-]"); arr.add(":ox"); arr.add(";-("); arr.add(";-)"); arr.add(";~("); arr.add(":~D");
        // 4

         arr.add(";2D"); arr.add("p~)"); arr.add(";~D"); arr.add("4)"); arr.add("4oD"); arr.add(";pD"); arr.add(":d"); arr.add("4-X"); arr.add(":D"); arr.add("(-p"); arr.add("'D"); arr.add("4X"); arr.add("8~)"); arr.add("8)"); arr.add("oD"); arr.add(";~D"); arr.add(":~)"); arr.add(";D"); arr.add("5o~)"); arr.add(":-)"); arr.add("5-)"); arr.add(";~)"); arr.add("(p"); arr.add("o~)"); arr.add("8~)"); arr.add("8)"); arr.add("(p"); arr.add("o)"); arr.add(";-x") ; arr.add("op"); arr.add("o8p"); arr.add(":)"); arr.add("4-p"); arr.add(":oX"); arr.add("(~d"); arr.add(":-d");
//         8

        int numberOfAllCSmileyFaces = 0;
        for(int j=0; j<arr.size();j++){
            String firstChar = String.valueOf(arr.get(j).charAt(0));
            String lastChar = String.valueOf(arr.get(j).charAt(arr.get(j).length()-1));

            boolean d = (firstChar.contains(":") || firstChar.contains(";")) &&
                    (lastChar.contains("D") || lastChar.contains(")"));

            switch(arr.get(j).length()){

            case 0:

                numberOfAllCSmileyFaces = 0; // need to change it to return 0;

            case 2:

                    if(d){
                        numberOfAllCSmileyFaces++;
//DEBUG                        System.out.println(d + "-> " + arr.get(j));
                    }

            case 3:
                    String middleChar = String.valueOf(arr.get(j).charAt(1));
                    if(d && ((middleChar.contains("-") || middleChar.contains("~")))
                    ){
                        numberOfAllCSmileyFaces++;
//DEBUG                         System.out.println(d + "-> " + arr.get(j));
                    }


            }
        }
        System.out.println(numberOfAllCSmileyFaces); // change it to return numberOfAllCSmileyFaces;
    }
}
