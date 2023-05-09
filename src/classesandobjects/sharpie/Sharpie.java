package sharpie;

public class Sharpie {

//    Create a Sharpie class
//    We should know the followings about each sharpie:
//    color (which should be a string),
//    width (which will be a number) and the
//    inkAmount (another number)
//    We need to specify the color and the width at creation
//    Every sharpie is created with a default inkAmount value: 100
//    We can use() the sharpie objects: using it decreases inkAmount by 10

    private String color;
    private int width;
    private int inkAmount = 100;

    public void use() {
        setInkAmount();
    }

    public int setInkAmount() {
        return inkAmount -= 10;
    }

    public int getInkAmount() {
        return inkAmount;
    }

    public static void main(String[] args) {
        Sharpie sharp = new Sharpie();
        sharp.color = "red";
        sharp.width = 3;
        System.out.println(sharp.getInkAmount());
        sharp.use();
        System.out.println(sharp.getInkAmount());
    }

}
