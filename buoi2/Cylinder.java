class Cylinder {
    private int height;
    private int radius;
    private double pi = 3.14;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double totalArea() {
        return 2 * pi * radius * height + 2 * pi * radius * radius;
    }

    public double volume() {
        return pi * radius * radius * height;
    }
}

class bai1 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(10);
        cylinder.setRadius(5);
        System.out.println("dien tich toan phan hinh tru: " + cylinder.totalArea());
        System.out.println("the tich hinh tru: " + cylinder.volume());
       
    }
}
