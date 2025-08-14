import java.util.Scanner;

public class StringNumberPalindrome {
    public void checkNumberPalindrome(int number){
        int temp_number = number;
        int last_digit, reverse=0;

        while(temp_number>0){
            last_digit = temp_number%10;
            reverse = reverse*10+last_digit;
            temp_number=temp_number/10;
        }

        if(number==reverse){
            System.out.println("Given number "+number+" is palindrome");
        }else{
            System.out.println("Given number "+number+" is not palindrome");
        }
    }

    public void checkStringPalindrome(String str){
        String revString = "";

       for(int i=str.length()-1;i>=0;i--){
        revString=revString+str.charAt(i);
       }

        if(str.equals(revString)){
            System.out.println("Given string '"+str+"' is palindrome");
        }else{
            System.out.println("Given string '"+str+"' is not palindrome");
        }
    }

    public static void main(String[] args) {
        StringNumberPalindrome snp=new StringNumberPalindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        snp.checkNumberPalindrome(number);
        sc.nextLine();
        System.out.println("Enter a string");
        String str = sc.nextLine();
        snp.checkStringPalindrome(str);

        sc.close();
    }
    
}
