import java.util.*;
public class countwhile {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int x =  sc.nextInt();
    int count=0;
    
    while(n!=0){
        int k = n%10;
        if(k==x)
        {
            count++;
        }
       n=n/10;
    }
    System.out.print(count);
}
    
}
