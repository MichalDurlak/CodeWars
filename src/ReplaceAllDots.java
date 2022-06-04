public class ReplaceAllDots {
    public static void main(String[] arg) {
        final String str = "one.two.three";
        System.out.print(str.replaceAll("[.]", "-"));
//        return str.replaceAll(".", "-");
    }
}
