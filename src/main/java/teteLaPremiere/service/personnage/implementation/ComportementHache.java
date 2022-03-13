package teteLaPremiere.service.personnage.implementation;

import teteLaPremiere.service.personnage.ComportementArme;

public class ComportementHache implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("frapper avec une hache");
    }
}
