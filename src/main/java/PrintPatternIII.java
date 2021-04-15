
/* printing below pattern
---------------------------
*****
*   *
*   *
*   *
*****
---------------------------
 */
public class PrintPatternIII {
    public static String printPatter() {
        String result = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==1||i==5||j==1||j==5)
                    result+= "*";
                else
                    result+=" ";
            }
            result+="\n";
        }
        return result;
    }
    public static void main(String args[]){
        String res= printPatter();
        System.out.println(res);
    }
}

