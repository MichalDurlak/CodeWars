public class FindTheMissingLetter {
// https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java
    public static void main(String[] args) {

//        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f'}));
//        System.out.println(findMissingLetter(new char[] { 'B','C','D','E','G'}));
        System.out.println(findMissingLetter(new char[] { 'Q', 'R', 'S', 'T', 'V', 'W'}));

    }

    public static char findMissingLetter(char[] array) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int indexStart = java.util.Arrays.binarySearch(alphabet, Character.toLowerCase(array[0]));
        int arrayCount = 0;
        char result = 'a';

        for (; ; indexStart++) {
            if (alphabet[indexStart] == Character.toLowerCase(array[arrayCount])) {
                arrayCount++;
            } else {
                result = alphabet[indexStart];
                break;
            }
        }


        if(Character.isUpperCase(array[0])){
            return Character.toUpperCase(result);
        }else{
            return result;
        }

    }
}

