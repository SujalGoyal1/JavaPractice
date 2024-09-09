import java.util.*;
public class replace {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number To Replace");
    int n =sc.nextInt();
    int x=sc.nextInt();
    int b=0;
    
    while(n!=0){
        int k = n%10;
        if(k==x)
        {
           k=9;
        }
    b=b*10+k;   
       n=n/10;
    }
    System.out.print(b);
}
    
}
