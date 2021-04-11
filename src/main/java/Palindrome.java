public class Palindrome {
    public static boolean isPalindrome(int n){
        boolean flag= true;
        if(n!=getReverse(n)){
            flag=false;
        }
        return flag;
    }
    public static int getReverse(int n){
        int r=0, revNumber=0;
        while(n>0){
            r=n%10;
            revNumber=(revNumber*10)+r;
            n=n/10;
        }
        return revNumber;
    }
    public static void main (String []args){
        int n=121;
        boolean res=isPalindrome(n);
        System.out.println("the number " + n + " is palindrome: "+ res);
    }
}
