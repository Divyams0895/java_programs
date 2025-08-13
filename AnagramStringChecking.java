// Anagram Strings means : if two strings are given then check length of both strings should be same, \
// and also contains same characters but not in same order

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringChecking {
    public boolean isAnagramStrings(String str1, String str2){

        int m = str1.length();
        int n= str2.length();

        if(m!=n){
            return false;
        }

        char ch1[] = str1.toCharArray();
        Arrays.sort(ch1);
        String string1 = new String(ch1);
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch2);
        String string2 = new String(ch2);

        for(int i=0;i<m;i++){
            if(string1.charAt(i)!=string2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        AnagramStringChecking asc = new AnagramStringChecking();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first string");
        String s1 = sc.nextLine();

        System.out.println("Enter second string");
        String s2 = sc.nextLine();

        boolean isCheck = asc.isAnagramStrings(s1, s2);
        if(isCheck){
            System.out.println("Given strings are anagram");
        }else{
            System.out.println("Given strings are not anagram");
        }
        sc.close();

    }
}
