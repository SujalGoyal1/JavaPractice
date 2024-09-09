import java.util.*;
public class palindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int b=0;
    
   for ( int i=n; i!=0; i=i/10){
     b= b*10 + i%10;
   }
   if(b==n){
    System.out.println("palindrome");
   }
   else{
    System.out.println("not palindrome");
   }
   
}
    
}
