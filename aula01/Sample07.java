import java.util.Scanner;

public class Sample07 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        String entradaDigitada;

        String nome;
        int idade;
        float peso;

        System.out.println("Digite a sua idade:");
        entradaDigitada = entrada.nextLine(); //leitura em formato de texto
        idade = Integer.parseInt(entradaDigitada); //converte o texto lido para número inteiro

        //idade = entrada.nextInt();

        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine();

        System.out.println("Digite o seu peso:");
        entradaDigitada = entrada.nextLine(); //leitura em formato de texto
        peso = Float.parseFloat(entradaDigitada);//converte o texto lido para número float

        //peso = entrada.nextFloat();

        System.out.println("Olá " + nome);
        System.out.println("Você tem " + idade + " anos.");
        System.out.println("Você tem " + peso + " Kg.");

        entrada.close();
    }
    
}