package Q2;
// package BookPack;

import java.util.Scanner;

interface calc {
    abstract void calcualteAmount();
}

class Book implements calc {

    @Override
    public void calcualteAmount() {
        float amt = quantity * price;
        System.out.println("The price of the book is " + amt);
    }

    String bookId, bookName;
    float price;
    int quantity;

    Book(int quantity, String bookId, String bookName, float price) {
        this.quantity = quantity;
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

}

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of books required:");
        int quantity = sc.nextInt();
        Book b = new Book(quantity, "B01", "Wings of Fire", 300.5f);
        b.calcualteAmount();

    }
}
