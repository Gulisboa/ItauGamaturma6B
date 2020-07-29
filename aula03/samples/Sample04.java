package samples;

public class Sample04 {
    public static void main(String[] args) {
        int cont, soma;

        cont = 1;
        soma = 0;

        while (cont <= 10) { 
            System.out.println(cont);
            soma = soma + cont; //acumula os valores do contador
            cont++; 
        }

        System.out.println("A soma dos números de 1 à 10 é " + soma);
    }
}