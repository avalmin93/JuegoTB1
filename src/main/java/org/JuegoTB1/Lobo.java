package org.JuegoTB1;

public class Lobo extends Carnivoro {
    public Lobo() {
        super(50, 3, 8); // Peso, velocidad, comida necesaria
    }

    @Override
    public Lobo clonar() {
        return new Lobo();
    }

    @Override
    public String getIcono() {
        return "🐺";
    }
}
