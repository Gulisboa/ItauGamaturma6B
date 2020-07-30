package exercicios;

public class AppEbook {
    public static void main(String[] args) {
        //criar os objetos do tipo livro
        Ebook book1 = new Ebook("Matemática para 5° serie", "James B.", 80);
        Ebook book2 = new Ebook("Português para 8° serie", "Thomas J.", 90);

        //utilzar os objetos criados
        book1.retrocederPagina();
        System.out.println("Página atual: " + book1.exibirPagina());

        book2.irParaPagina(910);
        //book2.paginaAtual = -9;
        System.out.println("Página atual: " + book2.exibirPagina());


        System.out.println("Qual página você quer ler?");
        int pagina = 100;

        //book1.paginaAtual = pagina;
        
        book1.irParaPagina(pagina);



    }
}