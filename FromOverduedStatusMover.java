package uz.octo;

public class FromOverduedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch(requestedStatus){
            case ARCHIVED:
                super.moveToStatus(book,Status.ARCHIVED);
                System.out.println("Moving from overdued to archieved");
                break;
            case AVAILABLE:
                super.moveToStatus(book,Status.AVAILABLE);
                System.out.println("Moving from overdued to available");
                break;
            default:
                System.out.println("Moving is not possible");
        }

    }
}
