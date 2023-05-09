package abstractsandinterfaces;

public class ShiftedCharSequence implements CharSequence {

    private String string;
    private int shift;

    public ShiftedCharSequence(String string, int shift) {
        this.string = string;
        this.shift = shift;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        index += (index + shift);
        return this.string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
}

