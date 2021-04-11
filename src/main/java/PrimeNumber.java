public class PrimeNumber {
    public static boolean checkPrime(int n){
        boolean flag=true;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                flag=false;
            }
        }
        return flag;
    }
    public static void main(String args[]){
        int n=7;
        boolean res=checkPrime(n);
        System.out.println( n+ " is prime number: "+res);
    }
}
