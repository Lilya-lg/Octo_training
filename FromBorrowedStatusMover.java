package uz.octo;

public class FromBorrowedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch(requestedStatus){
            case ARCHIVED:
                super.moveToStatus(book,Status.ARCHIVED);
                System.out.println("Moving from borrowed to archieved");
                break;
            case BORROWED:
                super.moveToStatus(book,Status.AVAILABLE);
                System.out.println("Moving from borrowed to available");
                break;
            case OVERDUED:
                super.moveToStatus(book,Status.OVERDUED);
                System.out.println("Moving from borrowed to overdued");
                break;
            default:
                System.out.println("Moving is not possible");
        }

    }
}
