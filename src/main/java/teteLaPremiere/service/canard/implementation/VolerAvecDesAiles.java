package teteLaPremiere.service.canard.implementation;

import teteLaPremiere.service.canard.ComportementVol;

public class VolerAvecDesAiles implements ComportementVol {
    @Override
    public void voler() {
        System.out.println("Je Vole.");
    }
}