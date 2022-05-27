public class BuyingACar {
    // link = https://www.codewars.com/kata/554a44516729e4d80b000012/train/java
    public static void main(String[] arg) {
//        int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth
        double toPoint = 0;
        int month = 0;
        double lossPercent = 1.5; // change 0 to percentLossByMonth;
        double secondCarWorth = 8000; // change 0 to startPriceNew;
        double oldCarWorth = 2000;    // change 0 to startPriceOld;
        double savingPerMonthTemp = 1000; // change 0 to savingperMonth;

        while(month <= 3){
            month++;
            if(month%2 == 0){
                lossPercent += 0.5;
            }
            secondCarWorth = (secondCarWorth*(100-lossPercent)/100);
            oldCarWorth = (oldCarWorth*(100-lossPercent)/100);

            toPoint = -secondCarWorth + savingPerMonthTemp  + oldCarWorth;

            System.out.println("end month "+month+": percent_loss "+lossPercent+" "+"available "+ toPoint);
        }

    }
}
