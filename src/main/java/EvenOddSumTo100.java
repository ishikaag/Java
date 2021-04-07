public class EvenOddSumTo100 {
    public static String calculateSum(){
        int evenSum=0, oddSum=0;
        int i=1;
        while(i<=100){
            if(i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }

            i++;
        }
        String result= "Even Sum: "+evenSum+"\n"+"Odd sum: "+ oddSum;
        return result;
    }
    public static void main(String[]args){
        System.out.println("Sum of all Odd and Even numbers upto 100 inclusive 100 \n");
        System.out.println(calculateSum());
    }
}
