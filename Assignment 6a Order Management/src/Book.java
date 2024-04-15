public abstract class Book extends Item implements Borrowable,Readable {
    String title;

    public void printBookState(String state) {
        switch (state){
            case IS_BORROWED:
                System.out.print(title+ " ");
                System.out.println("is borrowed");
                break;
            case IS_RETURNED:
                System.out.print(title+ " ");
                System.out.println("is returned");
                break;
            case IS_AVAILABLE:
                System.out.print(title+ " ");
                System.out.println("is available");
                break;
            case IS_NOT_AVAILABLE:
                System.out.print(title+ " ");
                System.out.println("is not available");
                break;
            case CANT_BE_BORROWED:
                System.out.print(title+ " ");
                System.out.println("can't be borrowed");
        }
    }
}
