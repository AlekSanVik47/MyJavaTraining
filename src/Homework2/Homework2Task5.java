package Homework2;


import java.util.Arrays;

public class Homework2Task5 {
    public static void main(String[] args) {




        int[] arr = new int[]{2, 15, 3, 10, 0, 175, 199, 247};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);

                }

            System.out.println("maximum number  " + max + ", minimum number  " + min);
        }
    }
