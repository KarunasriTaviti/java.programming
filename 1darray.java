// 1 Dimensional Array

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("enter the size of array");
        n=sc.nextInt();

        int[] arr = new int[n];
        

        System.out.println("Enter the array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing the array elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
