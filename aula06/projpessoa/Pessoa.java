package projpessoa;

/**
 * Pessoa
 */
public class Pessoa {

    private String nome, ender, tel;

    public Pessoa(){

    }
    
    public Pessoa(String nome, String ender, String tel){
        this.nome = nome;
        this.ender = ender;
        this.tel = tel;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEnder(){
        return ender;
    }

    public void setEnder(String ender){
        this.ender = ender;
    }

    public String getTelefone(){
        return tel;
    }

    public void setTelefone( String tel){
        this.tel = tel;
    }

}