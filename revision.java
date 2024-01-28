class revision{
    public static String stringConcatenation(String num1, String num2) {
        int n = num1.length()-1;
        int m = num2.length()-1;
        int i=0 ,j=0;
        int k =0;
        int l =0 ;
        char currchar,currchar1;
        while(n!=-1){
        currchar = num1.charAt(n);
         i = currchar*(int)Math.pow(10, (double)n);
         k = k+i;
        n--;
        }
        while(m!=-1){
        currchar1 = num2.charAt(m);
         j = currchar1*(int)Math.pow(10, (double)m);
        l = l+j;
        m--;
        }
        System.out.println(k);
        return (l+k)+"";
        }
     
public static void main(String[] args) {
String str = stringConcatenation("12", "23");  
 System.out.println(str);   
}
}