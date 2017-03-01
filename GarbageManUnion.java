import java.util.ArrayList;

public class GarbageManUnion{

    ArrayList<GarbageMan> myList = new ArrayList<GarbageMan>();

    public void addGarbageMan(String name, double price){
        this.myList.add(new GarbageMan(name, price));
    }
    public int unionCount(){
        return this.myList.size();
    }

    public void print(){
        for(int i = 0; i < this.unionCount(); i++){
            GarbageMan currentGarbageMan = this.myList.get(i);
            System.out.println(currentGarbageMan.getName() + " available for " +  currentGarbageMan.getPrice() + "kr\n");
        }
    }
    public int expensive(){
        int expensiveGarbageMen = 0;
        for(int i = 0; i < this.unionCount(); i++){
            if(this.myList.get(i).getPrice() > 100){
                expensiveGarbageMen++;
        }
    }
    return expensiveGarbageMen;
    }

}