package uz.octo;

public class BookMover {
    protected void moveToStatus(Book book, Status requestedStatus) {
        book.setStatus(requestedStatus);
    }

}
