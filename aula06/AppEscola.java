//package projpessoa;

import projpessoa.Estudante;

public class AppEscola {
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante("Emerson", "rua X", "112345-6789", 1234, "CCO", 2000);

        estudante.setNome("Marcos");

        System.out.println("RA: " + estudante.getRa());
        System.out.println("Estudante: " + estudante.getNome());

    }
}