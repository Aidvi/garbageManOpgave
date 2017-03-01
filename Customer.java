public class Customer {
    private String name;
    private double wealth;

    public Customer(String name, double wealth){
        this.name = name;
        this.wealth = wealth;
    }
    public void orderGarbageMan(double price){
        double result = this.wealth - price;
        if(result > 0){
            this.wealth -= price;
        }
        else {
            System.out.println("The Garbage man cannot approve your order");
        }
    }
    public double printWealth(){
        return this.wealth;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWealth() {
        return this.wealth;        
    }
    public void setWealth(double wealth){
        this.wealth = wealth;
    }

}