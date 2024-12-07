package org.JuegoTB1;

public class Conejo extends Herbivoro{

    public Conejo() {
        super(50, 3, 8);
    }

    @Override
    public Animal clonar() {
        return new Conejo();
    }

    @Override
    public String getIcono() {
        return "(__/)";
    }
}
