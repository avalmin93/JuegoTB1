package org.JuegoTB1;

public class Cocodrilo extends Carnivoro{
    public Cocodrilo() {
        super(50, 3, 8); // Peso, velocidad, comida necesaria
    }

    @Override
    public Cocodrilo clonar() {
        return new Cocodrilo();
    }

    @Override
    public String getIcono() {
        return "🐺";
    }
}
