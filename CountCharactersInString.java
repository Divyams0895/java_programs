import java.util.Scanner;

public class CountCharactersInString {
    public void countWithoutFunction(String data){
        int upperCase=0,lowerCase=0,digits=0,vowels=0,consonants=0;
        for(int i=0;i<data.length();i++){
            char ch = data.charAt(i);
            
            if(ch>='A' && ch<='Z'){
                upperCase++;
            }
            if(ch>='a' && ch<='z'){
                lowerCase++;
            }
            if(ch>='0' && ch<='9'){
                digits++;
            }
          
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
            System.out.println("Capital letters: "+upperCase);
            System.out.println("Small letters: "+lowerCase);
            System.out.println("Digits: "+digits);

            System.out.println("Vowels: "+vowels);
            System.out.println("Consonants: "+consonants);
    }

    public void countWithFunction(String data){
        int upperCase=0,lowerCase=0,digits=0,vowels=0,consonants=0;
        for(int i=0;i<data.length();i++){
            char ch = data.charAt(i);
            
            if(Character.isUpperCase(ch)){
                upperCase++;
            }

            if(Character.isLowerCase(ch)){
                lowerCase++;
            }
            if(Character.isDigit(ch)){
                digits++;
            }
           
        }
            System.out.println("Capital letters: "+upperCase);
            System.out.println("Small letters: "+lowerCase);
            System.out.println("Digits: "+digits);

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        CountCharactersInString ccs = new CountCharactersInString();
        ccs.countWithoutFunction(str);

        ccs.countWithFunction(str);

        sc.close();
    }
}
