import java.util.Scanner;

public class Programme_14_DiamondPattern {
    public static void printDiamond(int r,char ch){
        int i=1;
        int j;
        while(i<=r){
            j=1;
            while(i<=r){
                j=1;
                while(j++<=r-i){
                    System.out.println(" ");
                }
                j=1;
                while(j++<=i*2-1){
                    System.out.println(ch);
                }
                System.out.println();
                i--;
            }
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter the Number of row : ");
        int a = scanner.nextInt();
        System.out.print("Enter the symbol : ");
        char c = scanner.next().charAt(0);
        printDiamond(a, c);
        // closing the scanner object
        scanner.close();

    }
}
