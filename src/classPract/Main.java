package classPract;


@FunctionalInterface
interface  Calculator {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args){
        Calculator calculator =(a,b)->a+b;

    int result = calculator.calculate(100,200);
    System.out.println(result);
    }
}
