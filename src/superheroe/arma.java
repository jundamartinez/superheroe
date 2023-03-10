
package superheroe;

public class arma {
    private String nom_arm;
private int daño_arm;
   
    public arma(String nom_arm,int daño_arm) {
     this.nom_arm=nom_arm;
      this.daño_arm=daño_arm;
    }

    public String getNom_arm() {
        return nom_arm;
    }

    public void setNom_arm(String nom_arm) {
        this.nom_arm = nom_arm;
    }

    public int getDaño_arm() {
        return daño_arm;
    }

    public void setDaño_arm(int daño_arm) {
        this.daño_arm = daño_arm;
    }
    
    
}
