public class HumanReadableTime {
    public static void main(String[] arg) {
        int input = 359999;
        // 0, 5, 60, 86399, 359999
        String result = "H:M:S";
        int hours=0,minutes = 0;
        int seconds=input;

        while (seconds/60 >= 1){
            seconds -= 60;
            minutes ++;
        }

        while (minutes/60 >= 1){
            minutes -= 60;
            hours ++;
        }
        result = result.replace("H",String.format("%02d", hours));
        result = result.replace("M",String.format("%02d", minutes));
        result = result.replace("S",String.format("%02d", seconds));

        System.out.println(result); // replace to return result;

    }
}
