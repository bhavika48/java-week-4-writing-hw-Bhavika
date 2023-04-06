import java.util.Scanner;

public class Programme_6_NumberTriangle {
    public static void numTriangle(int n){
        for(int i =0;i<=n;i++){
            for(int j =0;j<i;j++){
                System.out.println(j +1);
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        // scanner declaration for reading input from scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers of brows");
        // calls static method
        numTriangle(scanner.nextInt());
        scanner.close();
    }
}
