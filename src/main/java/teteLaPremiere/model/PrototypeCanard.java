package teteLaPremiere.model;

import teteLaPremiere.service.implementation.Cancan;
import teteLaPremiere.service.implementation.NePasVoler;

public class PrototypeCanard extends Canard{

    public PrototypeCanard(){
        /*
        * Notre nouveau canard vient au monde...
        * sans aucun moyen de voler.*/
        comportementCancan = new Cancan();
        comportementVol = new NePasVoler();
    }
    @Override
    public void afficher() {
        System.out.println("Je Suis un prototype de Canard !");
    }
}
