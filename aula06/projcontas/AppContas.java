package projcontas;

public class AppContas {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(1234);
        ContaEspecial ce = new ContaEspecial(4321, 100);

        if(cc.saque(50) == true){
            System.out.println("Saque efetuado.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
        System.out.println(cc.exibir());

        if(ce.saque(50) == true){
            System.out.println("Saque efetuado.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
        System.out.println(ce.exibir());
        
    }
}