package teteLaPremiere.service.canard.implementation;

import teteLaPremiere.service.canard.ComportementCancan;

public class CanardMuet implements ComportementCancan {

    @Override
    public void cancaner() {
        System.out.println("Silence");
    }
}