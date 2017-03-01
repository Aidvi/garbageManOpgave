public class GarbageMan {
    private String name;
    private double price;

    public GarbageMan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
        return this.price;
    }
}