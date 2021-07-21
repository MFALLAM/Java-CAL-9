public class MyArrayDataException extends NumberFormatException {
    private int sizeOne;
    private int sizeTwo;

    public MyArrayDataException(int sizeOne, int sizeTwo) {
        this.sizeOne = sizeOne;
        this.sizeTwo = sizeTwo;
    }

    public MyArrayDataException(String s, int sizeOne, int sizeTwo) {
        super(s);
        this.sizeOne = sizeOne;
        this.sizeTwo = sizeTwo;
    }
}
