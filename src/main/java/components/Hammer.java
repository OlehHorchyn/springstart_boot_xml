package components;

public class Hammer implements Tool {
    private int weight = 900;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Hammer() {

    }

    public Hammer(int weight) {
        this.weight = weight;
    }

    public void fix() {

    }
}
