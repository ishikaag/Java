public class SumOfDigits {
    public static int calSum(int n){
        int sum=0;
        while(n>0){
            int s=n%10;
            sum+=s;
            n/=10;
        }
        return sum;
    }
    public static void main(String []args){
        int n=9911;
        int res=calSum(n);
        System.out.println(res);
    }
}
