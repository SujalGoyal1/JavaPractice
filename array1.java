import java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr = {1,2,3,4,5};
        //for (int i=0; i<arr.length ;i++)
        for (int i=arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]); 
        }
    }
}
