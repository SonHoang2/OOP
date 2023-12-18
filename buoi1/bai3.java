import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = obj.nextInt();
        System.out.println("nhap a b: ");
        int a = obj.nextInt();
        int b = obj.nextInt();

        int [] arr = new int [n];
        obj.close();
        // tao mang
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * (b - a) + a);
        }

        int min = arr[0], max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // in 
        System.out.print("in mang arr: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
