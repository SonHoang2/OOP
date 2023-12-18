public class bai2 {
    public static void main (String[] args) {
        int n = 500;
        for (int a = 1; a < n; a++) {
            for (int b = a; b < n; b++) {
                double temp = Math.sqrt(a*a + b*b);
                if (temp % 1 == 0) {
                    int c = (int) temp;
                    System.err.println(a + " " + b + " " + c);
                }
            }
        }
    }
}
