package uz.octo;

public class Inheritance {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings",Status.ARCHIVED);
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());
    }
}
