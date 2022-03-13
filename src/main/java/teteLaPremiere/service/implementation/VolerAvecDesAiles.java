package teteLaPremiere.service.implementation;

import teteLaPremiere.service.ComportementVol;

public class VolerAvecDesAiles implements ComportementVol {
    @Override
    public void voler() {
        System.out.println("Je Vole.");
    }
}