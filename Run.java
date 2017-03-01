public class Run{

    public static void main(String[] args){
        GarbageMan per = new GarbageMan("Per", 120.75);
        Customer helle = new Customer("Helle", 1000.25);
        GarbageManUnion counter = new GarbageManUnion();

        helle.orderGarbageMan(per.getPrice());
        System.out.println("\nHelle was charged and the remaining amount is " + helle.printWealth() + "kr\n");

        counter.addGarbageMan("Thomas", 130.55);
        counter.addGarbageMan("Retard", 200.95);
        counter.addGarbageMan("Morten", 120.55);
        counter.addGarbageMan("Magnus", 10.55);
        counter.addGarbageMan("Mia", 150.55);
        System.out.println("The company has " + counter.unionCount() + " Garbage men available \n");

        counter.print();

        System.out.println("There is " + counter.expensive() + " expensive garbage men");
    }
}