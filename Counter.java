package Vtalent.com.Feb;

public class Counter {
    private int count; //Instance Variable
    //Constructor
    Counter() {
        count = 0;
    }
    //to get the count
    public int getCount(){
        return count;
    }
    //increment
    public void incrementCount(){
        count++;
    }
    public void decrementCount(){
        count--;
    }

}
