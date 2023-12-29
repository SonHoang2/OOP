import java.util.Scanner;

class Publication {
    private String name;
    private float cost;

    public Publication(String name, float cost) {
        this.name = name;
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("ten: " + getName());
        System.out.println("gia: " + getCost());
    }

    @Override
    public String toString() {
        return "ten: " + getName() + ", gia: " + getCost();
    }
}

class Book extends Publication {
    private int pages;

    public Book(String name, float cost, int pages) {
        super(name, cost);
        this.pages = pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("so trang: " + getPages());
    }

    @Override
    public String toString() {
        return "book: " +  super.toString() + ", so trang: " + getPages();
    }
}

class Tape extends Publication {
    private float playingTime;

    public Tape (String name, float cost, float playingTime) {
        super(name, cost);
        this.playingTime = playingTime;
    }

    public float getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(float playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("playing time : " + getPlayingTime());
    }

    @Override
    public String toString() {
        return "Tape: " + super.toString() + ", playing time: " + getPlayingTime();
    }
}



public class bai2 {
    public static void main(String[] args) {
        while (true) {
            Scanner obj = new Scanner(System.in);
            System.out.println("\nchon so: ");
            System.out.println("1. nhap sach.");
            System.out.println("2. nhap bang.");
            System.out.println("3. thoat.");

            int number = obj.nextInt();
            int totalBooks, totalTapes;
            Book [] books;
            Tape [] tapes;

            if (number == 1) {
                System.out.println("so luong sach: ");
                totalBooks = obj.nextInt();

                books = new Book[totalBooks];

                for (int i = 0; i < totalBooks; i++) {
                    System.out.println("nhap ten sach: ");
                    String name = obj.next();
    
                    System.out.println("nhap gia sach: ");
                    float cost = obj.nextFloat();
    
                    System.out.println("so trang sach: ");
                    int pages = obj.nextInt();
    
                    books[i] = new Book(name, cost, pages); 
                }

                for (int i = 0; i < totalBooks; i++) {
                    System.out.print("\n");
                    books[i].display();
                }
            } else if (number == 2) {
                System.out.println("so luong bang: ");
                totalTapes = obj.nextInt();

                tapes = new Tape[totalTapes];

                for (int i = 0; i < totalTapes; i++) {
                    System.out.println("nhap ten bang: ");
                    String name = obj.next();
    
                    System.out.println("nhap gia bang: ");
                    float cost = obj.nextFloat();
    
                    System.out.println("thoi gian bang: ");
                    float playingTime = obj.nextFloat();
    
                    tapes[i] = new Tape(name, cost, playingTime); 
                }

                for (int i = 0; i < totalTapes; i++) {
                    System.out.print("\n");
                    tapes[i].display();
                }
            } else if (number == 3) {
                break;
            } else {
                System.out.println("chi chon tu 1 den 3.");
            }
        }
    }
}
