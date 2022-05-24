public class ConvertStringToCamelCase {

    public static void main(String[] arg) {

        String input = "the_Stealth_Warrior";
        String[] splited = input.split("[_-]");
        String converted = splited[0];

        for (int i=1; i< splited.length; i++){
            converted += String.valueOf(splited[i].charAt(0)).toUpperCase()+splited[i].substring(1);
        }


        System.out.println(converted);
    }
}
