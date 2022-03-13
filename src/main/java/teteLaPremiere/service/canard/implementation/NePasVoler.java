package teteLaPremiere.service.canard.implementation;

import teteLaPremiere.service.canard.ComportementVol;

public class NePasVoler implements ComportementVol {
    @Override
    public void voler() {
        System.out.println("Je ne sais pas voler");
    }
}