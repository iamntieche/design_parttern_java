package teteLaPremiere.main;

import teteLaPremiere.model.personnage.Chevalier;
import teteLaPremiere.model.personnage.Personnage;
import teteLaPremiere.service.personnage.ComportementArme;
import teteLaPremiere.service.personnage.implementation.ComportementArcEtFleches;
import teteLaPremiere.service.personnage.implementation.ComportementEpee;
import teteLaPremiere.service.personnage.implementation.ComportementHache;
import teteLaPremiere.service.personnage.implementation.ComportementPoignard;

public class PersonnageMain {

    public static void main(String[] args) {

        Personnage chevalier = new Chevalier();
        ComportementArme epee = new ComportementEpee();
        System.out.println("********Arme de Combat encours*****");
        chevalier.setArme(epee);
        epee.utiliserArme();
        chevalier.combattre();
        System.out.println("********Arme de Combat encours*****");
        ComportementArme hache = new ComportementHache();
        chevalier.setArme(hache);
        hache.utiliserArme();
        System.out.println("********Arme de Combat encours*****");
        ComportementArme poignard = new ComportementPoignard();
        chevalier.setArme(poignard);
        poignard.utiliserArme();
        System.out.println("********Arme de Combat encours*****");
        ComportementArme arch = new ComportementArcEtFleches();
        chevalier.setArme(arch);
        arch.utiliserArme();

    }
}
