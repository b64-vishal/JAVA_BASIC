public class inverted_halfpyr {
    public static void main(String[] args){
        int n=4;
        for(int i=1; i<=n; i++){
            //inner space loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //innerloop for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
