package Gift4_2;

public class Jellybean extends Item {


    private double size;


    public Jellybean(String name, double price, double weight, double size) {
        super(name, price, weight);
        this.size = size;
    }


    public Jellybean() {
    }


    public double getSize() {
        return size;
    }


    public void setSize(double size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Jellybean: " + super.toString() + ", size = " + size + " inches";
    }
}
