package teteLaPremiere.service.personnage.implementation;

import teteLaPremiere.service.personnage.ComportementArme;

public class ComportementPoignard implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("porter un coup de poignard");
    }
}
