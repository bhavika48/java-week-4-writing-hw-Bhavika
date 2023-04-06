import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {
    public static void findMinAndMaxNumbers() {
        // scanner declaration from reading input from console
        Scanner scanner= new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        // while loop
        while (true){
            System.out.println("Enetr number :");
            boolean  isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    min= number;
                    max=number;
                }
                if(number<min){
                    min= number;
                }else{
                    break;
                }
                scanner.nextLine(); // handle input
                System.out.println("Min = "+ "min+,max="+max);
                scanner.close();
            }
        }
    }

    public static void main(String[] args) {
        findMinAndMaxNumbers();
    }


}
