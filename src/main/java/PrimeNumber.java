public class PrimeNumber {
    public static boolean checkPrime(int n){
        boolean flag=true;
        if(n<=1){
            flag=false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                flag= false;
            }
            else
                flag= true;
        }
        return flag;
    }
    public static void main(String args[]){
        int n=1;
        boolean res=checkPrime(n);
        System.out.println( n+ " is prime number: "+res);
    }
}
