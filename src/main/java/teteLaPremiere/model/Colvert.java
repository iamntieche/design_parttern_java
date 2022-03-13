package teteLaPremiere.model;

import teteLaPremiere.service.implementation.Cancan;
import teteLaPremiere.service.implementation.VolerAvecDesAiles;

public class Colvert extends  Canard{

    public Colvert(){
        /*
        Puisqu’un Colvert utilise la classe Cancan pour cancaner,
        quand effectuerCancan() est appelée,
         la responsabilité du cancanement
         est déléguée à l’objet Cancan et
          nous obtenons un vrai cancan.
          Et il utilise VolerAvecDesAiles
          comme type de ComportementVol.
        */

        /*Souvenez-vous que Colvert hérite les
        variables d’instance comportementCancan et
        comportementVol de la classe Canard.*/

        comportementCancan = new Cancan();
        comportementVol = new VolerAvecDesAiles();


    }

    @Override
    public void afficher() {
        System.out.println("Je suis un vrai colvert");
    }
}
