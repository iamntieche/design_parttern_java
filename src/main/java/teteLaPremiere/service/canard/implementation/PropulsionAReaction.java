package teteLaPremiere.service.canard.implementation;

import teteLaPremiere.service.canard.ComportementVol;

/*
* Qu’à cela ne tienne ! Nous créons un
nouveau comportement de vol : la propulsion à réaction*/
public class PropulsionAReaction implements ComportementVol {


    @Override
    public void voler() {
        System.out.println("Je vole avec un réacteur !");
    }
}
