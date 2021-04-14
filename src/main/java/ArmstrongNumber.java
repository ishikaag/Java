import java.util.Scanner;

// Check for Armstrong Number for n number of digits.
public class ArmstrongNumber {
    public static int getCube(int n){
        int temp=1, sum=0;
        int max=getDigits(n);
        while(n>0){
            int r=n%10;
            for(int i=1;i<=max;i++){
            temp*=r;
            }
            sum+=temp;
            temp=1;
            n=n/10;
        }
        return sum;
    }
    public static int getDigits(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count=count+1;
        }
        return count;
    }
   public static boolean checkArmstrongNumber(int n){
        if(getCube(n)==n) {
            return true;
        }
    return false;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        boolean res= checkArmstrongNumber(n);
        System.out.println("given number is an Armstrong Number: "+res);
    }
}
