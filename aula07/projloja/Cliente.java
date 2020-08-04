package projloja;

public class Cliente {
    private String nome;
    private String email;
    private float credito;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.credito = 0;
    }

    public float getCredito() {
        return credito;
    }

    protected void setCredito(float credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return nome + " : " + email + " : " + credito;
    }

    public boolean fazerCompra(float valor) {
        if (valor > 0 && credito >= valor) {
            credito = credito - valor;
            return true;
        }
        return false;
    }

    public boolean colocarCredito(float valor) {
        if (valor > 0) {
            credito = credito + valor;
            return true;
        }
        return false;
    }
}