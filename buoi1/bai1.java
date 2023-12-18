import java.util.Scanner;

public class bai1 {
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("nhap vao 2 so: ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        obj.close();
        int i;
        int min = a > b ? b : a;
        for (i = 2; i < min; i++) {
            if ((a % i) == 0 && (b % i) == 0) break;
            if (i == min) {
                System.out.println("khong co mau chung nho nhat");
                return;
            }
        }
        System.out.println("mau chung nho nhat la: " + i);
        return;
    }
}
