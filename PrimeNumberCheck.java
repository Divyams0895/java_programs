import java.util.Scanner;

public class PrimeNumberCheck {

    public void checkPrimeMethod1(int number){
        int temp;
        boolean isPrime = true;
      
        for (int i = 2; i<= number/2; i++) {
            temp = number%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) 
            System.out.println(number + " is prime");
            else
                System.out.println(number + " is not a prime");
    }

    public void checkPrimeMethod2(int number){
       
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
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");

        int number = sc.nextInt();
        PrimeNumberCheck pcheck = new PrimeNumberCheck();
        pcheck.checkPrimeMethod1(number);

        pcheck.checkPrimeMethod2(number);
        sc.close();
        
    }
}
