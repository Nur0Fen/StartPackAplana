package Gift4_2;

public class Biscuit extends Item {


    private String taste;


    public Biscuit(String name, double price, double weight, String taste) {
        super(name, price, weight);
        this.taste = taste;

    }


    public Biscuit() {

    }


    public String getTaste() {
        return taste;

    }


    public void setTaste(String taste) {
        this.taste = taste;

    }


    @Override
    public String toString() {
        return "Biscuit: " + super.toString() + ", taste = " + taste;
    }
}

