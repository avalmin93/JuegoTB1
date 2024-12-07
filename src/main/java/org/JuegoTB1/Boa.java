package org.JuegoTB1;

public class Boa extends Carnivoro{
    public Boa() {
        super(50, 3, 8); // Peso, velocidad, comida necesaria
    }

    @Override
    public Boa clonar() {
        return new Boa();
    }

    @Override
    public String getIcono() {
        return "🐺";
    }
}
