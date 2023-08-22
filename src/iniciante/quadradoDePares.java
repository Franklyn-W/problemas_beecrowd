package iniciante;

import java.util.Scanner;

public class quadradoDePares {
    
    public static void main(String[] args) {
        
        //Ler valor inteiro N

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        //Apresentar o quadrado de cada valor PAR, de 1 até N

        for (int i = 2; i <= N; i+=2) {
            System.out.println(i + "^2 = " + (int)Math.pow(i, 2.0));
        }

        leitor.close();
    }
}
