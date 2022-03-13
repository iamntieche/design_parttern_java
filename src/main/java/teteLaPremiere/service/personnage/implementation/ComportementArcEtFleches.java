package teteLaPremiere.service.personnage.implementation;

import teteLaPremiere.service.personnage.ComportementArme;

public class ComportementArcEtFleches implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("tirer une Flèche");
    }
}
