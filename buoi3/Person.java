class Person {
    private int [] score;
    private String name;
    private int year;

    public Person(String name, int year, int[] score) {
        this.name = name;
        this.year = year;
        this.score = score;
    }

    public double getAverageScore() {
        int totalScore = 0;
        for (int item : score) {
            totalScore += item;
        }
        return totalScore / score.length;
    }

    public boolean haveScoreLowerThan5() {
        for (int item : score) {
            if (item < 5) {
                return true;
            }
        }
        return false;
    }
}

class bai1 {
    public static void main(String[] args) {
        int [] score = {10, 9, 8, 7, 6, 5, 10, 9, 8};
        int n = 3;
        int luanVan = 0, thiTotNghiep = 0, thiLai = 0;
        Person [] student;

        student = new Person[n];
        student[0] = new Person("nguyen van a", 2003, score);
        student[1] = new Person("nguyen van b", 2003, score);
        student[2] = new Person("nguyen van c", 2003, score);

        for (int i = 0; i < n; i++) {
            if(student[i].getAverageScore() >= 7 && !student[i].haveScoreLowerThan5()) {
                luanVan++;
            } else if (student[i].getAverageScore() < 7  && !student[i].haveScoreLowerThan5()) {
                thiTotNghiep++;
            } else {
                thiLai++;
            }
        }
        
        System.out.println("hoc vien duoc phep lam luan van: " + luanVan);
        System.out.println("hoc vien duoc phep thi tot nghiep: " + thiTotNghiep);
        System.out.println("hoc vien thi lai: " + thiLai);
    }
}


