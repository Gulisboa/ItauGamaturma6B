package samples;

public class Sample02 {
    
    public static void main(String[] args) {
    
        final int notaParaAprovacao = 7; //constante, não pode mudar de valor
        int numero = 10;
        boolean passouNoTeste = true; //true, false

        System.out.println(numero);
        System.out.println(numero + notaParaAprovacao);
        System.out.println(numero >= notaParaAprovacao);
 
        //notaParaAprovacao = 8; //vai dar erro!

        passouNoTeste = ( numero > notaParaAprovacao ) || ( numero == notaParaAprovacao );
        System.out.println(passouNoTeste);

        if(passouNoTeste){ //teste  == true
            System.out.println("passou no teste");
        }else{
            System.out.println("não passou no teste");
        }
    }

}