import java.net.StandardSocketOptions;
import java.util.Scanner;
public class evenodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer number :");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is odd");
        }

    }
}
