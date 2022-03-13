import teteLaPremiere.model.Canard;
import teteLaPremiere.model.Colvert;
import teteLaPremiere.model.PrototypeCanard;
import teteLaPremiere.service.implementation.PropulsionAReaction;

public class MiniSimulateur {

    public static void main(String[] args) {
        System.out.println("Start application");
        Canard canard = new Colvert();
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

        Canard proto = new PrototypeCanard();
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
