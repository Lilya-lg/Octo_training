package uz.octo;

public class FromAvailableStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch(requestedStatus){
            case ARCHIVED:
                super.moveToStatus(book,Status.ARCHIVED);
                System.out.println("Moving from available to archieved");
                break;
            case BORROWED:
                super.moveToStatus(book,Status.BORROWED);
                System.out.println("Moving from available to borrowed");
                break;
            default:
                System.out.println("Moving is not possible");
        }

    }
}
