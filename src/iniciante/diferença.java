package iniciante;

import java.util.Scanner;

public class diferença {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        System.out.println("DIFERENCA = " + ((A * B)-(C * D)));

        scan.close();
    }
}
