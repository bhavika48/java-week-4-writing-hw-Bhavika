import java.util.Scanner;

public class Programme_8_SymbolTriangle {
    public static void symbolTriangle(int n){
        for(int i =0;i<=n;i++){
            for(int j = 0;j<i; j++){
                System.out.println("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // scanner declaration for reading from scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows :");
        symbolTriangle(scanner.nextInt());
        // closing scanner object
        scanner.close();
    }
}
