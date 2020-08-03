package projrelogio;
/**
 * Relogio
 */
public class Relogio {

    int hora, minuto, segundo;

    public Relogio(){
        hora = 24;
        minuto = 0;
        segundo = 0;
    }

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public String exibir() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo(){
        return segundo;
    }

    public void setHora(int hora){
        if(hora > -1 && hora < 23){
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto){
        if(minuto > -1 && minuto < 60){
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo){
        if(segundo > -1 && segundo < 60){
            this.segundo = segundo;
        }
    }
}