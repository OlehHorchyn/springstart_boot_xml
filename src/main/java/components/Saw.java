package components;

public class Saw implements Tool{
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type = "hand";


    public void fix() {
        System.out.println(type);
    }
}
