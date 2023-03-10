
package superheroe;

public class escudo {
    private String nom_esc;
private int vida;
   
    public escudo(String nom_esc,int vida) {
     nom_esc=nom_esc;
      vida=vida;
    }

    public String getNom_esc() {
        return nom_esc;
    }

    public void setNom_esc(String nom_esc) {
        this.nom_esc = nom_esc;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
}
