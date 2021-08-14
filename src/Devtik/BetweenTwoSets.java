package Devtik;

import java.util.Scanner;

public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int largestNumber = -1;
        int totalNumbersBetweenSets = 0;

        System.out.println("Please enter the length of the array1 :");
        int[] arr1 = new int[get.nextInt()];

        System.out.println("Please enter the length of the array2 :");
        int[] arr2 = new int[get.nextInt()];

        System.out.println("start fill the array1 data");
        for (int i = 0; i < arr1.length; i++) {
            int userInput = get.nextInt();
            if (userInput > largestNumber) largestNumber = userInput;
            arr1[i] = userInput;
        }

        System.out.println("start fill the array2 data");
        for (int i = 0; i < arr2.length; i++) {
            int userInput = get.nextInt();
            if (userInput > largestNumber) largestNumber = userInput;
            arr2[i] = userInput;
        }

        int i = 1;
        while (i <= largestNumber){
            int totalFounded = 0;
            for (int y:arr1) {
                if (i%y == 0) totalFounded++;
                else totalFounded = 0;
            }
            if (totalFounded == arr1.length){
                totalFounded = 0;
                for (int y:arr2) {
                    if (y%i == 0) totalFounded++;
                    else totalFounded = 0;
                }
                if (totalFounded == arr2.length) totalNumbersBetweenSets++;
            }
            i++;
        }

        System.out.println(totalNumbersBetweenSets);
    }
}
