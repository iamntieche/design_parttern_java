package teteLaPremiere.model.personnage;

import teteLaPremiere.service.personnage.ComportementArme;

public abstract class Personnage {
    ComportementArme arme;

    public abstract void combattre();
    /* l'injection par setter est utile dans le parttern strategy afin de changer
    le comportement de l'intance de la clase au cours de son exécution*/
    public void setArme(ComportementArme arme) {
        this.arme = arme;
    }
}
