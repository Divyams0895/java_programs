import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");

        number = sc.nextInt();
        boolean isPrime=true;

        if(number<=1){
            isPrime =false;
        }
        else{
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("The given number "+number+" is prime");
        }else{
             System.out.println("The given number "+number+" is not prime");
        }
    }
}
