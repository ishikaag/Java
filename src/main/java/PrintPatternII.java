/* printing below pattern
---------------------------
     *
    * *
   * * *
  * * * *
 * * * * *
---------------------------
 */
public class PrintPatternII {
    public static String printPattern(){
        String result="";
        for(int i=1;i<=5;i++){
            for(int k=5; k>i; k--) {
                result+=" ";
            }
            for (int j = 1; j <= i; j++) {
                result += "* ";
            }
            result+="\n";
        }
        return result;
    }
    public static void main(String args[]){
        String res=printPattern();
        System.out.println(res);
    }
}
