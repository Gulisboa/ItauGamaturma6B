import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, quantidadeKW, valorPorKW, valorConta ;
        final float desconto = 0.15f;
        final float porcentagemKW = ( 1.0f / 500);

        System.out.println("Informe o valor do salário mínimo: ");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Qual a quanitdade de KW consumido:");
        quantidadeKW = entrada.nextDouble();

        valorPorKW = salarioMinimo *  porcentagemKW;

        valorConta = valorPorKW * quantidadeKW;

        System.out.println("Valor por KW: " + valorPorKW);
        System.out.println("Valor a ser pago: " + valorConta);
        System.out.println("Valor com desconto: " + (valorConta - valorConta * desconto) );

        entrada.close();
    }
}