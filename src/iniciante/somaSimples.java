package iniciante;

import java.util.Scanner;

public class somaSimples {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("SOMA = " + (num1+num2));

        scan.close();
        
    }
}
