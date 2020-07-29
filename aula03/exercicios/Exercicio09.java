package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, soma, qtdePositivos;
        double media, porcentagemPositivos;
        final int qtdeValores = 5;

        soma = 0;
        qtdePositivos = 0;

        for (int i = 0; i < qtdeValores; i++) {
            System.out.print("Digite o valor: ");
            valor = Integer.parseInt(in.nextLine());

            soma += valor;

            if (valor >= 0) {
                qtdePositivos++;
            }
        }

        media = (double) soma / qtdeValores;
        porcentagemPositivos = (double) qtdePositivos / qtdeValores;

        System.out.printf("Soma = %d\nQuantidade positivos = %d\n" , soma, qtdePositivos);
        System.out.printf("Média valores = %.2f\n", media);
        System.out.println("Porcentagem positivos = " + (porcentagemPositivos * 100) + " %");

        in.close();
    }
}