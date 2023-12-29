import java.util.Scanner;

class Sinhvien {
    private String name;
    private String dob;
    private String homeTown;

    public Sinhvien (String name, String dob, String homeTown) {
        this.name = name;
        this.dob = dob;
        this.homeTown = homeTown;
    }

    public String getDob() {
        return dob;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getName() {
        return name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("\nten sinh vien: " + getName());
        System.out.println("ngay thang nam sinh: " + getDob());
        System.out.println("que quan: " + getHomeTown());
    }
}

class SinhVienNganhDien extends Sinhvien {
    private int diemDien1;
    public SinhVienNganhDien(String name, String dob, String homeTown, int diemDien1) {
        super(name, dob, homeTown);
        this.diemDien1 = diemDien1;
    }

    public int getDiemDien1() {
        return diemDien1;
    }

    public void setDiemDien1(int diemDien1) {
        this.diemDien1 = diemDien1;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("diem nganh dien: " + getDiemDien1());
    }
}

class SinhVienNganhCo extends Sinhvien {
    private int diemCo1;
    public SinhVienNganhCo(String name, String dob, String homeTown, int diemCo1) {
        super(name, dob, homeTown);
        this.diemCo1 = diemCo1;
    }

    public int getDiemCo1() {
        return diemCo1;
    }

    public void setDiemCo1(int diemCo1) {
        this.diemCo1 = diemCo1;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("diem nganh co: " + getDiemCo1());
    }
}

class CuuSinhVien extends Sinhvien {
    private int graduateYear;
    public CuuSinhVien(String name, String dob, String homeTown, int graduateYear) {
        super(name, dob, homeTown);
        this.graduateYear = graduateYear;
    }

    public int getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(int graduateYear) {
        this.graduateYear = graduateYear;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("nam tot nghiep: " + getGraduateYear());
    }
}

public class bai3 {
    public static void main(String[] args) {
        while (true) {
            Scanner obj = new Scanner(System.in);
            System.out.println("\nchon so: ");
            System.out.println("1. sinh vien nganh dien.");
            System.out.println("2. sinh vien nganh co.");
            System.out.println("3. cuu sinh vien.");
            System.out.println("4. thoat.");

            int number = obj.nextInt();

            if (number == 1) {
                System.out.println("nhap so sinh vien: ");
                int tongSinhVienND = obj.nextInt();
                SinhVienNganhDien [] sinhVienND = new SinhVienNganhDien[tongSinhVienND];

                for (int i = 0; i < tongSinhVienND; i++) {
                    System.out.println("nhap ten sinh vien: ");
                    String name = obj.next();

                    System.out.println("nhap ngay thang nam sinh: ");
                    String dob = obj.next();

                    System.out.println("nhap que quan: ");
                    String homeTown = obj.next();

                    System.out.println("nhap diem mon 1: ");
                    int diem1 = obj.nextInt();

                    sinhVienND[i] = new SinhVienNganhDien(name, dob, homeTown, diem1);
                }

                for (int i = 0; i < tongSinhVienND; i++) {
                    sinhVienND[i].display();
                }
            } else if (number == 2) {
                System.out.println("nhap so sinh vien: ");
                int tongSinhVienNC = obj.nextInt();
                SinhVienNganhCo [] sinhVienNC = new SinhVienNganhCo[tongSinhVienNC];

                for (int i = 0; i < tongSinhVienNC; i++) {
                    System.out.println("nhap ten sinh vien: ");
                    String name = obj.next();

                    System.out.println("nhap ngay thang nam sinh: ");
                    String dob = obj.next();

                    System.out.println("nhap que quan: ");
                    String homeTown = obj.next();

                    System.out.println("nhap diem mon 1: ");
                    int diem1 = obj.nextInt();

                    sinhVienNC[i] = new SinhVienNganhCo(name, dob, homeTown, diem1);
                }

                for (int i = 0; i < tongSinhVienNC; i++) {
                    sinhVienNC[i].display();
                }
            } else if (number == 3 ) {
                System.out.println("nhap so sinh vien: ");
                int tongCuuSinhViens = obj.nextInt();
                CuuSinhVien [] cuuSinhViens = new CuuSinhVien[tongCuuSinhViens];

                for (int i = 0; i < tongCuuSinhViens; i++) {
                    System.out.println("nhap ten sinh vien: ");
                    String name = obj.next();

                    System.out.println("nhap ngay thang nam sinh: ");
                    String dob = obj.next();

                    System.out.println("nhap que quan: ");
                    String homeTown = obj.next();

                    System.out.println("nam ra truong: ");
                    int graduateYear = obj.nextInt();

                    cuuSinhViens[i] = new CuuSinhVien(name, dob, homeTown, graduateYear);
                }

                for (int i = 0; i < tongCuuSinhViens; i++) {
                    cuuSinhViens[i].display();
                }
            } else if (number == 4 ) {
                break;
            } else {
                System.out.println("chi chon tu 1 den 5.");
            }
        }
    }
}
