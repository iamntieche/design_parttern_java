package teteLaPremiere.model;

import teteLaPremiere.service.ComportementCancan;
import teteLaPremiere.service.ComportementVol;

public abstract class Canard {

    // Variables d'instances
    /*Chaque Canard a une référence à quelque
    chose qui implémente l’interface
    ComportementCancan et/ou comportementVol*/
    ComportementVol comportementVol;
    ComportementCancan comportementCancan;

    public Canard(){}
   public void effectuerCancan(){
       /*
       * Au lieu de gérer son cancanement lui-même,
       *  l’objet Canard délègue ce comportement à
       * l’objet référencé par comportementCancan.
       * Les variables du comportement sont
       * déclarées du type de l’INTERFACE comportementale.
       */
       comportementCancan.cancaner();
   }

   public void effectuerVol(){
        comportementVol.voler();
   }

     public abstract  void afficher();

    public void nager() {
    System.out.println("Tous les canards flottent, même les leurres!");
}

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public void setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }
}
