
public class AppRelogio {
    public static void main(String[] args) {
        
        Relogio relogio = new Relogio(5, 67, 12);
        //Relogio relogio2 = new Relogio();

        System.out.println(relogio.exibir());


        relogio = new Relogio();

        //relogio.hora = 3;
        
        //relogio.setHora(-9);

        System.out.println("Hora atual: " + relogio.getHora());


    }
}