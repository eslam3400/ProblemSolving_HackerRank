package Devtik;

import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Please enter the length of array");
        int arrLength = get.nextInt();
        int [] arr = new int[arrLength];
        System.out.println("Please enter the number wanna check");
        int numberToCheck = get.nextInt();
        System.out.println("Please fill the array");
        for (int i = 0; i < arr.length; i++) arr[i] = get.nextInt();
        System.out.println(numberOfPairsFounded(arr,numberToCheck));
    }

    public static int numberOfPairsFounded(int[] arr,int numberToCheck){
        int pairsFounded = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) if ( i < j && (arr[i]+arr[j]) % numberToCheck == 0) pairsFounded++;
        }
        return pairsFounded;
    }
}
