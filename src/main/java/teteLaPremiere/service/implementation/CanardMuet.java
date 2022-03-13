package teteLaPremiere.service.implementation;

import teteLaPremiere.service.ComportementCancan;

public class CanardMuet implements ComportementCancan {

    @Override
    public void cancaner() {
        System.out.println("Silence");
    }
}