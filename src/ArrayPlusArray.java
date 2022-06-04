public class ArrayPlusArray {
    public static void main(String[] arg) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int result = 0;
        for (int i: arr1){
            result += i;
        }
        for (int j: arr2){
            result += j;
        }

        System.out.println(result); // change to return result;
    }
}
