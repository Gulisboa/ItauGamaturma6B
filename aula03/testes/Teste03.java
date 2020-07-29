package testes;

public class Teste03 {
    public static void main(String[] args) {
        byte cont;

        cont = 1;
        while( cont > 0 ) {
            System.out.print(cont + " ");
            cont++; //se esquecer entra em loop infinito
        }

    }
}