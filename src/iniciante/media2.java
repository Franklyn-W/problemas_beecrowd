package iniciante;

import java.util.Scanner;

public class media2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nA = scan.nextDouble();
        double nB = scan.nextDouble();
        double nC = scan.nextDouble();

        double media = ((nA * 2) + (nB * 3) + (nC * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        scan.close();
    }
}
