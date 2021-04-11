public class FactorialOfNumber {
    public static int getFactorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n=3;
        int res=getFactorial(n);
        System.out.println("Factorial of "+ n + " = "+res);
    }
}

