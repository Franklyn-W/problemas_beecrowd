package iniciante;

import java.util.Scanner;

public class areaDoCirculo {

    public static void main(String[] args) {

        double pi = 3.14159;
        int cont = 0;
        Scanner scan = new Scanner(System.in);

        while (cont < 3) {

            double raio = scan.nextDouble();

            double area = pi * (raio * raio);

            System.out.printf("A=%.4f \n", area);
            cont++;
            }
            
        scan.close();
    }
}
