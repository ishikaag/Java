public class PrintingMultiplicationTable {
    public static String getTable(int n){
        int i=1;
        int mul=0;
        String table="";
        while(i<=10){
            mul=i*n;
            table+= n+" X "+i+" = "+mul+"\n" ;
            i++;
        }
        return table;
    }
    public static void main (String args[]){
        int n=9;
        String table=getTable(n);
        System.out.println(table);
    }
}
