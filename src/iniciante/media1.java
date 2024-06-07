package iniciante;

import java.util.Scanner;

public class media1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();

        double media = ((n1 * 3.5) + (n2 * 7.5))/11;

        System.out.printf("MEDIA = %.5f\n", media);

        scan.close();
    }
}
