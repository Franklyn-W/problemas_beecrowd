package matematica;

import java.util.Scanner;

public class somaFatoriais {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNextInt()) {

            int fator1 = entrada.nextInt();
            int fator2 = entrada.nextInt();

            long f1 = fator1;
            long f2 = fator2;

            if (fator1 > 1) {

                while (fator1 > 1) {
                    f1 = f1 * (fator1 - 1);
                    fator1--;
                }
            } else {
                f1 = 1;
            }

            if (fator2 > 1) {

                while (fator2 > 1) {
                    f2 = f2 * (fator2 - 1);
                    fator2--;
                }
            } else {
                f2 = 1;
            }

            long somaFatorial = f1 + f2;

            System.out.println(somaFatorial);
        }

        entrada.close();
    }
}
