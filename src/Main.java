public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] rev = {800, 700, 1000, 400};
        int[] exp = {400,500,450,300};
        System.out.println(calculateGrossProfit(rev, exp));


    }
    public static int calculateGrossProfit(int[] revenue, int[] expenses){
       int grossProfit=0;
       for(int i=0; i<revenue.length; i++){
           int dayProfit=revenue[i]-expenses[i];
           grossProfit+=dayProfit;
       }
        return grossProfit;
    }
}