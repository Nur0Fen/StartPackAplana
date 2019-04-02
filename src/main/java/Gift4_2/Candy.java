package Gift4_2;

public class Candy extends Item {


    private String color;


    public Candy(String name, double price, double weight, String color) {
        super(name, price, weight);
        this.color = color;
    }


    public Candy() {
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Candy: " + super.toString() + ", color = " + color;
    }
}

