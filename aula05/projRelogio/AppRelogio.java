
public class AppRelogio {
    public static void main(String[] args) {
        
        Relogio relogio = new Relogio(5, 67, 12);

        System.out.println(relogio.exibir());

        relogio.setHora(-9);

        System.out.println("Hora atual: " + relogio.getHora());


    }
}