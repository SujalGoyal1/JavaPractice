import java.util.*;
public class sumofintegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum = 0;
        int num = sc.nextInt();
        
       /*  for(int i=1;i<=num;i++){
                sum = sum + i;
                System.out.println(i);*/
         for (int i=2; i<num; i+=2){
            sum=sum+i;
               
        //while (i<=num){
          //   sum = sum +i ;
           // i++;
       
        } 
         System.out.println(sum);
    
    }
}
