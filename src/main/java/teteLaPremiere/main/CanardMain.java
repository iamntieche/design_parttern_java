package teteLaPremiere.main;

import teteLaPremiere.model.canard.Colvert;
import teteLaPremiere.model.canard.PrototypeCanard;
import teteLaPremiere.service.canard.implementation.PropulsionAReaction;
public class CanardMain {

    public static void main(String[] args) {
        System.out.println("Start application");
        teteLaPremiere.model.canard.Canard canard = new Colvert();
        /*
        * Cette ligne appelle la méthode héritée
        effectuerCancan() de Colvert, qui délègue
        alors à ComportementCancan de l’objet
        (autrement dit appelle cancaner() sur la
        référence héritée comportementCancan du
        canard).
        Puis nous faisons de même avec la méthode
        héritée effectuerVol() de Colvert.
        */
        canard.effectuerCancan();
        canard.effectuerVol();

        teteLaPremiere.model.canard.Canard proto = new PrototypeCanard();
        /* Le premier appel de effectuerVol() délègue à l’objet comportementVol défini dans le constructeur de PrototypeCanard, qui est une instance de NePasVoler.*/
        proto.effectuerVol();
        /*
        * Ceci invoque la méthode set
        héritée du prototype, et ...voilà
        ! Le prototype est soudain doté
        d’une fonctionnalité de vol… à
        réaction*/

        proto.setComportementVol(new PropulsionAReaction());

        proto.effectuerVol();
    }
}
