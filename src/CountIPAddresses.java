public class CountIPAddresses {
    // link = https://www.codewars.com/kata/526989a41034285187000de4/train/java
    public static void main(String[] arg) {
        String start = "0.0.0.0";
        String end = "255.255.255.255";
        String[] splitedStartIP = start.split("[.]");
        String[] splitedEndIP = end.split("[.]");
        Integer[] endResults = new Integer[4];

        for(int i=0; i < 4 ; i++){

            endResults[i]=Integer.parseInt(splitedEndIP[i])-Integer.parseInt(splitedStartIP[i]);
        }

        System.out.println(endResults[3]+(endResults[2]*256)+(endResults[1]*256)+(endResults[0]*256));


    }
}
