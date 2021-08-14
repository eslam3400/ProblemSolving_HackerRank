package Devtik;

import java.util.HashMap;
import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Number Of Birds");
        int[] birds = new int[get.nextInt()];
        System.out.println("enter the ids of the birds");
        for (int i = 0; i < birds.length; i++) birds[i] = get.nextInt();
        System.out.println(mostFrequentlySighted(birds));
    }

    public static int mostFrequentlySighted(int[] arr){
        HashMap<Integer, Integer> birds = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                birds.put(arr[i],1);
                continue;
            }
            if (birds.get(arr[i]) == null) birds.put(arr[i],1);
            else birds.put(arr[i], birds.get(arr[i])+1);
        }
        int counter = 0;
        int result = 0;
        for (int id : birds.keySet()) {
            System.out.println("key: " + id + " value: " + birds.get(id));
            if (counter == 0) result = id;
            else{
                if (birds.get(id) > birds.get(result)) result = id;
                if (birds.get(id) == birds.get(result) && result > id) result = id;
            }
            counter++;
        }
        return result;
    }
}