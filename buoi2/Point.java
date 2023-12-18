class Point {
    private double x;
    private double y;
    private double z;

    public Point() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void Negate() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
    }

    public double Norm() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public void Print() {
        System.out.println(x + " " + y + " " + z);
    }
}

class bai2 {
    public static void main(String[] args) {
        Point point = new Point(2, 3, 5);
        point.Negate();
        point.Print();
        System.out.println(point.Norm());
    }
}