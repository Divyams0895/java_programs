import java.util.Scanner;

public class SwapTwoNumbers {
    public void swapNumbersWithTempVariable(int number1, int number2){
        int temp_variable;

        System.out.println("Numbers before swap: "+number1+" "+number2);
        temp_variable = number1;
        number1 = number2;
        number2 = temp_variable;
         System.out.println("Numbers after swap: "+number1+" "+number2);
    }

    public void swapNumbersWithoutTempVariable(int number1, int number2){

        System.out.println("Numbers before swap: "+number1+" "+number2);
        number1 = number1+number2;
        number2 = number1-number2;
        number1 = number1-number2;
         System.out.println("Numbers after swap: "+number1+" "+number2);
    }

    public static void main(String[] args) {
       SwapTwoNumbers swap = new SwapTwoNumbers();
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter two numbers");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();

       swap.swapNumbersWithTempVariable(num1,num2);
        swap.swapNumbersWithoutTempVariable(num1,num2);
        sc.close();
    }
}
