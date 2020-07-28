package uri;

import java.util.Scanner;

/**
 * Uri1003
 */
public class Uri1003 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in );
        int a, b; 
        float soma;

        a = entrada.nextInt();
        b = entrada.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);

        /*

        No printf temos:

        %s - String
        %d - inteiros
        %f - float ou double

        \n - pular para a proxima linha

        */
        System.out.printf("%d + %d = %.1f\n", a, b, soma);

        entrada.close();
    }

}