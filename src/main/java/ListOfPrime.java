public class ListOfPrime {
    public static String getListOfPrime(int m, int n){
        int min=Math.min(m,n);
        int max=Math.max(m,n);
        String listOfPrime="";
        for(int i=min; i<=max; i++){
            if(isPrime(i))
                listOfPrime+=i+" ";
        }
        return listOfPrime;
    }
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2; i<n/2; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        int a=9, b=20;
        String res = getListOfPrime(b,a);
        System.out.println(res);
    }

}
