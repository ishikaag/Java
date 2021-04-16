import java.util.Scanner;

/* printing below pattern
---------------------------
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
---------------------------
 */
public class PrintPatternIV {
    public static String printPattern(int rows){
        String result="";
        for(int i=1; i<=rows; i++){
            for(int k=rows; k>i; k--){
                result+=" ";
            }
            for(int j=1; j<=i; j++){
                result+="* ";
            }
            result+="\n";
        }
        for(int i=(rows-1); i>=1;i--){
            for( int k=rows; k>i; k--){
                result+=" ";
            }
            for(int j=1;j<=i;j++){
                result+="* ";
            }
            result+="\n";
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows for diamond");
        int rows= sc.nextInt();
        String res= printPattern(rows);
        System.out.println(res);
    }

}
