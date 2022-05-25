public class BreakcamelCase {
    // link = https://www.codewars.com/kata/5208f99aee097e6552000148/java
    public static void main(String[] arg) {

        String input = "camelCasing";
        String camelCasing = "";

        for(int i=0; i<input.length();i++){
            if(Character.isUpperCase(input.charAt(i))){
                camelCasing += " "+input.charAt(i);
            } else {
                camelCasing += input.charAt(i);
            }
        }

        System.out.println(camelCasing); //need to change return camelCasing;

    }
}
