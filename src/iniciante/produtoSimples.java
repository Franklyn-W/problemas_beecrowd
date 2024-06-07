package iniciante;

import java.util.Scanner;

public class produtoSimples {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int prod = num1 * num2;

        System.out.println("PROD = " + prod);

        scan.close();
    }
}
