package Devtik;

import java.util.Scanner;

public class SubarrayDivision {

    static  Scanner get = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("Please enter the number of segments");
        int segments[] = new int [get.nextInt()];
        System.out.println("Please enter ron's birth day");
        int day = get.nextInt();
        System.out.println("Please enter ron's birth month");
        int month = get.nextInt();
        fillSegments(segments);
    }

    protected static void fillSegments(int array[]){
        int n = -1;
        for (int i = 0; i < array.length; i++) {
            n = get.nextInt();
            if (1 <= n && n <= 5) array[i] = n;
        }
    }

    protected static int process(int array[],int numberOfSquares,int sumOfSquares){
        for (int i = 0; i < array.length; i++) {

        }
        return 0;
    }
}