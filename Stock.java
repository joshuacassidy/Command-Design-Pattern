public class Stock {

    private String name;
    private int quantity;

    public Stock() {
        name = "sample";
        quantity = 5;
    }

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Buying " + quantity + " " + name);
    }

    public void sell() {
        System.out.println("Selling " + quantity + " " + name);
    }

}
