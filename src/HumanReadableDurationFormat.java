import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class HumanReadableDurationFormat {
    // https://www.codewars.com/kata/52742f58faf5485cae000b9a/train/java

    public static void main(String[] args) {
        int seconds = 1;
        int minutes = (int) TimeUnit.SECONDS.toMinutes(seconds);
        seconds -= minutes*60;
        int hours = (int) TimeUnit.MINUTES.toHours(minutes);
        minutes -= hours*60;
        int days = (int) TimeUnit.HOURS.toDays(hours);
        hours -= days*24;
        int years = days/365;
        days -= years*365;

        ArrayList numbers = new ArrayList();
        numbers.add(seconds);
        numbers.add(minutes);
        numbers.add(hours);
        numbers.add(days);
        numbers.add(years);

        ArrayList listOne = new ArrayList();
        listOne.add("seconds");
        listOne.add("minutes");
        listOne.add("hours");
        listOne.add("days");
        listOne.add("years");

        ArrayList listTwo = new ArrayList();
        listTwo.add("second");
        listTwo.add("minute");
        listTwo.add("hour");
        listTwo.add("day");
        listTwo.add("year");


        ArrayList result = new ArrayList<>();


        System.out.println(numbers);

        for(int i = 0 ; i < numbers.size() ; i++){
            if((int)numbers.get(i) == 1){
                result.add("1 " + listTwo.get(i));
            } else if ((int) numbers.get(i) > 1) {
                result.add(numbers.get(i) + " " + listOne.get(i));
            }
        }


        String finalResut = "";

        if(seconds == 0){
            finalResut = "now";
        }

        if(result.size() == 1){
            finalResut = (String) result.get(0); // change to return result;
        } else if (result.size() == 2){
            finalResut = (result.get(1) + " and " + result.get(0));
        } else if (result.size() == 3){
            finalResut = (result.get(2) +", "+result.get(1) + " and " + result.get(0));
        } else if (result.size() == 4){
            finalResut = (result.get(3)+", "+result.get(2) +", "+result.get(1) + " and " + result.get(0));
        }else if (result.size() == 5){
            finalResut = (result.get(4)+", "+result.get(3)+", "+result.get(2) +", "+result.get(1) + " and " + result.get(0));
        }


        System.out.println(finalResut); // change to return finalResult








//        System.out.println(seconds + ", " + minutes+ ", " + hours+ ", " + days+ ", " + years);

//        int minutes = (seconds/60);
//        seconds -= (minutes*60);
//        int hours = (minutes/60);
//        minutes -= (hours*60);
//
//        String result = "";
//
//        if(hours == 0){} else if (hours == 1){result += "1 hour,";}else{}

//        System.out.println(result);

//        System.out.println(TimeUnit.SECONDS.toMinutes(seconds));


    }
}
