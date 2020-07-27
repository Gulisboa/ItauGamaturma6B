import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario;

        System.out.println("Informe o valor do salario: ");
        salario = entrada.nextFloat();

        salario = salario * 1.25f; //salario = salario + salario * 0.25;

        System.out.println("O novo salário é " + salario);

        entrada.close();
    }
}