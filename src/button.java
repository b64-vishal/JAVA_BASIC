import java.util.Scanner;
public class button {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the button :");
        int b=sc.nextInt();
        switch(b){
            case 1: System.out.println("Hello !");
            break;
            case 2: System.out.println("Namaste !");
            break;
            case 3: System.out.println("Bounjor !");
            break;
            default: System.out.println("Invalid button ");
        }
    }
}
