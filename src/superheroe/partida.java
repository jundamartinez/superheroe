
package superheroe;


public class partida {
    private int val_resultado;
    private Superheroe atacante;
   private Superheroe victima;
   private escudo escudo;
    private arma arma;

    public int getVal_resultado() {
        return val_resultado;
    }

    public void setVal_resultado(int val_resultado) {
        this.val_resultado = val_resultado;
    }

    public Superheroe getAtacante() {
        return atacante;
    }

    public void setAtacante(Superheroe atacante) {
        this.atacante = atacante;
    }

    public Superheroe getVictima() {
        return victima;
    }

    public void setVictima(Superheroe victima) {
        this.victima = victima;
    }

    public escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(escudo escudo) {
        this.escudo = escudo;
    }

    public arma getArma() {
        return arma;
    }

    public void setArma(arma arma) {
        this.arma = arma;
    }
    
}
