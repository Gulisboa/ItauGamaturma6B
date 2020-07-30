package exemplos;

public class AppLivro {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.titulo = "Programação com Java";
        livro.autor = "Deitel";
        livro.disponivel = true;

        livro.emprestar();

        boolean possoEmprestar = livro.estaDisponivel();

        if(possoEmprestar){
            System.out.println("O livro " + livro.titulo + " está disponível");
        }else{
            System.out.println("O livro " + livro.titulo + " não está disponível");

        }
    }
}