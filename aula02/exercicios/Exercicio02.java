package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, media;

        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextFloat();

        media = nota1 * 0.4f + nota2 * 0.6f;

        if (media >= 6) {
            System.out.printf("Aprovado com %.2f de média", media);
        } else {
            System.out.printf("Reprovado com %.2f de média", media);
        }

        entrada.close();
    }
}