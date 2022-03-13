package teteLaPremiere.model.canard;

import teteLaPremiere.service.canard.implementation.Cancan;
import teteLaPremiere.service.canard.implementation.NePasVoler;

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
        System.out.println("Je Suis un prototype de teteLaPremiere.main.Canard !");
    }
}
