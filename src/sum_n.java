import java.util.Scanner;
public class sum_n {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a= sc.nextInt();
        int sum=0;
        for(int i=1; i<=a; i++){
            sum=sum+i;
        }
        System.out.println("sum of first " +a+ " natural number is "+sum);
    }
}
