package CS240Assignments.PrimeNum;

import java.util.*;


public class DisplayPrimeNum {
    private static int max = 229;//just to encapsulate the value of max
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int primeNumbers = 50;//To give the amount of prime numbers we want to find
       Stack<Integer> container = new Stack<>();//for storing the prime numbers

       findPrimeNum(primeNumbers, container);//Call the method so that the main method has all of the information needed for printing the data.
       System.out.printf("The first %d primeNumbers are: %s%n", primeNumbers, container);

       input.close();//close scanner.
    }


    //This method handles all of the main logic
    public static void findPrimeNum(int primeNumbers, Stack<Integer> container){
       int numbersFound = 0;//incrementer for keeping track of each primeNumber found
       boolean isPrime = true;//Flag for determining if a number is prime which is why it's a boolean
      
   
        for(int num = 2; num <= max; num++){
            isPrime = true;
         for(int factor = 2; factor <= Math.sqrt(num); factor++){//using sqrt to make the range of divisors smaller.
            //takes the remainder from the operation
             if(num % factor == 0){
                 isPrime = false;
                 break;
             }
        }
        if(isPrime){
        container.push(num);//Push the primeNumber onto the stack
        numbersFound++;//increment 

        //once all the prime numbers are found end the looping
        if(numbersFound == primeNumbers){
            break;
        }
         
        }
      }
    }
}
