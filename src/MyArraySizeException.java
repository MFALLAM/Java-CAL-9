public class MyArraySizeException extends ArrayStoreException  {

    private int sizeAllowed;

    public MyArraySizeException(int sizeAllowed) {
        this.sizeAllowed = sizeAllowed;
    }

    public MyArraySizeException(String message, int sizeAllowed) {
        super(message);
        this.sizeAllowed = sizeAllowed;
    }
}
