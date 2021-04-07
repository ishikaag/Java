public class BigNumber {
    public static int getNum(int n, int m , int s){
        int big= n;
        if(big<m){
            big=m;
        }
        if(big<s){
            big=s;

        }
        return big;
    }
    public static void main(String args[]){
        int a=80, v=9, b=19;
        System.out.println(getNum(a,v,b));
    }
}
