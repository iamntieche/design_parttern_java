package teteLaPremiere.service.personnage.implementation;

import teteLaPremiere.service.personnage.ComportementArme;

public class ComportementEpee implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("brandir une epée");
    }
}
