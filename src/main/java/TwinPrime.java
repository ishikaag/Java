public class TwinPrime {
    public static String getTwinPrime(int n, int m){
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        String twinPrime="";
        for(int i=min; i<=max-2; i++){
            if(isPrime(i) && isPrime(i+2)){
                twinPrime+=i+","+(i+2)+" - ";
            }
        }
        return twinPrime.substring(0, twinPrime.length() - 2); //to return the last pair with appending "-" at last
    }
        public static boolean isPrime(int n){
        if(n<=1)
            return false;
            for(int i=2; i<=n/2; i++){
                if(n%i==0)
                    return false;
        }
            return true;
    }
    public static void main (String args[]){
        int s=1, p=100;
        String res=getTwinPrime(p,s);
        System.out.println(res);
    }
}