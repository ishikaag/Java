public class ReverseNumber {
    public static int reverse(int n){
        int revNumber=0;
        while(n>0){
            int remainder= n % 10;
            revNumber=(revNumber * 10)+remainder;
            n= n/10;
        }
        return revNumber;
    }
    public static void main(String args[]){
        int i=123;
        int res=reverse(i);
        System.out.println(res);
    }
}
