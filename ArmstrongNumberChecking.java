// To check whether the given number is Armstrong or not
// Armstrong number means : The sum of its own digits each raised to the power of the number of digits
//  Example: 153 is an armstrong number , 1^3+5^3+3^3 = 153 (power is same as number of digits)

import java.util.Scanner;
public class ArmstrongNumberChecking {

    public String armstrongChecking(int number){
        int temp_number = number;
        int digit,sum=0;
        int count = 0;
        while(temp_number>0){
            digit = temp_number%10;
            count=count+1;
            temp_number = temp_number/10;
        }

        temp_number = number;
        while(temp_number>0){
            digit = temp_number%10; //returns last digit of the number
            sum = sum + (int)Math.pow(digit, count);
            temp_number=temp_number/10;
        }
        // System.out.println(sum);
        if(number==sum){ 
            return "The given number "+number+" is an armstrong number";
        }else{
            return "The given number "+number+" is not an armstrong number";
        }
    }

    public static void main(String[] args) {
        ArmstrongNumberChecking obj = new ArmstrongNumberChecking();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println(obj.armstrongChecking(num));
        sc.close();
    }
    
}
