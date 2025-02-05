package CS240Assignments.FibonacciIterator;

public class FibonacciNum{
    public static void main(String[] args) {
        FibonacciNumbers sequence = new FibonacciNumbers(23390);

        for(int value : sequence){
            System.out.printf("%s%n", value);
        }
    }
}