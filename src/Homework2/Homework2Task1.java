package Homework2;


public class Homework2Task1 {
    public static void main(String[] args) {
        invertArray();
    }
    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            arr[0] = 1;
            if (arr[i] == 1) {
                arr[i] = 0;
            }  else {
                arr[i] = 1;
            }
            System.out.print(arr[i]);
    }
    }

}
