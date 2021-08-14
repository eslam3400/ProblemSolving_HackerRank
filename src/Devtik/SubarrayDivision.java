package Devtik;

import java.util.Scanner;

public class SubarrayDivision {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Please enter the squares number of chocolate bar");
        int chocoBarSegments = get.nextInt();
        System.out.println("Please enter the numbers on the segments in order");
        int[] chocoBar = new int[chocoBarSegments];
        for (int i = 0; i < chocoBar.length; i++) {
            chocoBar[i] = get.nextInt();
        }
        System.out.println("please enter the birthday");
        int day = get.nextInt();
        System.out.println("please enter the birth month");
        int month = get.nextInt();
        System.out.println(calcDivideWays(chocoBar,day,month));
    }

    public static int calcDivideWays (int[] array,int day,int month){
        int divideWays = 0;
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++){
                if (counter < month) sum += array[j];
                else break;
                counter++;
            }
            if (sum == day) divideWays++;
            sum = 0;
            counter = 0;
        }
        return divideWays;
    }
}