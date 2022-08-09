import java.util.*;
public class sum {
    public static int psum(int a,int b){
        int sum1=a+b;
        return sum1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number :");
        int b=sc.nextInt();

       int sum1=psum(a,b);
        System.out.println("sum of two number is :"+sum1);
    }
}
