import java.util.*;
public class function {
    public static void print_name(String name){
        System.out.println(name);
        return;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value name :");
        String name = sc.next();
        print_name(name);
    }
}
