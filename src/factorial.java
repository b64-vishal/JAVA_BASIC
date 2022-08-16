import java.util.Scanner;
public class factorial {
    public static void fact(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int facto=1;
        for(int i=n; i>=1; i--){
            facto=facto*i;
        }
        System.out.println(facto);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int n=sc.nextInt();
        fact(n);

    }
}
