package teteLaPremiere.service.implementation;

import teteLaPremiere.service.ComportementCancan;

public class Cancan implements ComportementCancan {

    @Override
    public void cancaner() {
        System.out.println("Cancan");
    }
}