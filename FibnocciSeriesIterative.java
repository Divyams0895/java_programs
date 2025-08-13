import java.util.Scanner;

public class FibnocciSeriesIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        int n1 = 0, n2 = 1;
        
        for(int i=0;i<=limit;i++){
            int c = n1+n2;
            System.out.print(c+" ");
            n1 = n2;
            n2 = c;
        }

        sc.close();
    }
}
