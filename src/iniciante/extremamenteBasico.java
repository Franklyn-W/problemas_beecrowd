package iniciante;

import java.util.Scanner;

public class extremamenteBasico {
    
    public static void main(String[] args) {
        
        //leia 2 valores inteiros e armazene em A e B
        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();

        //Efetue a soma de A e B, atribuindo o resultado a X
        int X = A + B;

        //Imprima X conforme solicitado -> X = 0
        System.out.println("X = " + X);

        leitor.close();
    }
}
