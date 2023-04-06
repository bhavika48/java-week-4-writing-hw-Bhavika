import java.util.Scanner;

public class Programme_5_PalindromeNumber {
    public static boolean isPalindrome(int number){
        // converts possitive number to nagative
        if(number<0){
            number= -number;
        }
        int lastDigit,reverse =0,temp;
        temp=number;
        while(number>0){
            // store last digit
            lastDigit= number % 10;
            reverse= reverse*10+lastDigit;
            number=number/10;
        }
        return reverse==temp;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();
        boolean check = isPalindrome(a);
        if(check)
            System.out.println("Number is palindrome");
        else{
            System.out.println("Number is not palindrome");
            // closing scanner object
            scanner.close();
        }


    }
}
