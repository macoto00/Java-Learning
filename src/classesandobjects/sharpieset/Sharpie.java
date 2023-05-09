package sharpieset;

public class Sharpie {

    private String color;
    private int width;
    private int inkAmount;

    public Sharpie(String color, int width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void use() {
        inkAmount -= 10;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getInkAmount() {
        return inkAmount;
    }

    public void setInkAmount(int inkAmount) {
        this.inkAmount = inkAmount;
    }
}
