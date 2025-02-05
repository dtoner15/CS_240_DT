package CS240Assignments.FibonacciIterator;

import java.util.*;

public class FibonacciNumbers implements Iterable<Integer>{
    private int limit;//create a variable to hold a limit

    public FibonacciNumbers(int limit){
        this.limit = limit;//assinging instance variable to parameter so that we can set the limit
    }

    //create an instance of the FibIterator and put it in the Iterator method to iterate over the fibonacci sequence.
    public Iterator<Integer> iterator(){
        return new FibIterator();
    }

    //This class is needed to implement the fibonacci logic. 
    public class FibIterator implements Iterator<Integer>{
    private int a = 0; //Inital starting point for first variable
    private int b = 1; //Inital starting point for second variable

    //If the numbers total are less than the limit continue to the next sequence.
    public boolean hasNext() {
        if((a + b) > limit){
            return false;
        }

        return true;
    }


    //Generates the next fibonacci number.
    public Integer next() {
       int temp = a + b;
       a = b;
       b = temp;
       return a;
    }
    
  }

}

