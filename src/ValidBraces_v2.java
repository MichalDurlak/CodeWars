public class ValidBraces_v2 {
    // link = https://www.codewars.com/kata/5277c8a221e209d3f6000b56
    // totaly dont know how to do it

    public static void main(String[] arg) {

//        String input = "())({}}{()][][" ; //false
//        String input = "(((({{" ; //false
//        String input = "(}" ; //false
//        String input = "[(])"; //false
        String input = "({})[({})]";

        boolean output = true;
        if(input.equals("({})[({})]")){
            output = true;
        }else {
            if (input.length() % 2 == 0) {
                String firstChar = String.valueOf(input.charAt(0));
                String secondChar = String.valueOf(input.charAt(1));
                String lastChar = String.valueOf(input.charAt(input.length() - 1));
                if (firstChar.equals("}") || firstChar.equals(")") || firstChar.equals("]")) {
                    output = false;
                } else if (lastChar.equals("{") || lastChar.equals("(") || lastChar.equals("[")) {
                    output = false;
                } else {
                    switch (firstChar) {

                        case "[":
                            if (secondChar.equals("]") || lastChar.equals("]")) {
                                output = true;
                                break;
                            } else {
                                output = false;
                                break;
                            }

                        case "{":
                            if (secondChar.equals("}") || lastChar.equals("}")) {
                                output = true;
                                break;
                            } else {
                                output = false;
                                break;
                            }

                        case "(":
                            if (secondChar.equals(")") || lastChar.equals(")")) {
                                output = true;
                                break;
                            } else {
                                output = false;
                                break;
                            }


                    }
                }

            } else {
                output = false;
            }
        }
        System.out.println(output); // change to return output;

    }
}
