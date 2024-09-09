import java.util.*;
public class reverse {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int rev_num = 0;
    for(  ; num!=0;num/=10 ){
        int digit = num%10;
        rev_num = rev_num * 10 + digit;
    }
    System.out.println("rev_num: " + rev_num);
   
    }
}
