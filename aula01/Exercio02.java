import java.util.Scanner;

public class Exercio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, media;

        System.out.println("Digite a primeira nota");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a primeira nota");
        nota2 = entrada.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println("Sua média foi " + media);

        entrada.close();
    }
}