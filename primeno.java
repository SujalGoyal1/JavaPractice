import java.util.*;
public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        for (int i =2; i<=x; i++){
            if(x%i==0){
            System.out.println("Not a Prime number");
            break;

            }
            else{
                System.out.println("Prime number hai");
                break;
            }
        }
    }
}

