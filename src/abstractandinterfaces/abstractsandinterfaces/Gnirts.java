package abstractsandinterfaces;

public class Gnirts implements CharSequence {
    private String string;

    public Gnirts(String string) {
        this.string = new StringBuilder(string).reverse().toString();
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}



