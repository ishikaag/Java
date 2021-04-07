public class NextMulOf100 {
    public static int getNextMul(int n){
        int multiple=((n/100)+1)*100;
        return multiple;
    }
    public static void main(String []args){
        int n= 378;
        int result= getNextMul(n);
        System.out.println(("next multiple of 100 is "+ result));

    }
}
