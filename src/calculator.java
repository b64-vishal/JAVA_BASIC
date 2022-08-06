import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Choose an operator : +,-,* or /");
        char op= input.next().charAt(0);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 value : ");
        int v=sc.nextInt();
        System.out.println("Enter 2 value : ");
        int j=sc.nextInt();

        switch(op){
            case '+': int res=v+j;
            System.out.println(v + "+" +j+ "=" +res);
            break;
            case '-': res=v-j;
            System.out.println(v + "-" +j+ "=" +res);
            break;
            case '*': res=v*j;
            System.out.println(v + "*" +j+ "=" +res);
            break;
            case '/': res=v/j;
            System.out.println(v + "/" +j+ "=" +res);
            break;
        }



    }
}
