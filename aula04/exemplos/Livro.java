package exemplos;

/**
 * Livro
 */
public class Livro {

    //atributos do livro : características do livro
    String titulo;
    String editora;
    String autor;
    int numeroPaginas;
    boolean disponivel;

    //métodos do livro: ações ou comportamentos do livro
    public void emprestar(){
        disponivel = false;
    } 

    public void devolver(){ //void significa que o método não tem retorno
        disponivel = true;
    }

    public boolean estaDisponivel(){
        return disponivel;
    }

}