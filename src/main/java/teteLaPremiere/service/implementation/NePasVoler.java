package teteLaPremiere.service.implementation;

import teteLaPremiere.service.ComportementVol;

public class NePasVoler implements ComportementVol {
    @Override
    public void voler() {
        System.out.println("ce canard ne vole pas");
    }
}