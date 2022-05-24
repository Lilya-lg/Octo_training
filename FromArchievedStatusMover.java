package uz.octo;

public class FromArchievedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch(requestedStatus){
            case AVAILABLE:
                super.moveToStatus(book,Status.AVAILABLE);
                System.out.println("Moving from archieved to available");
                break;
            default:
                System.out.println("Moving is not possible");
        }

    }
}
