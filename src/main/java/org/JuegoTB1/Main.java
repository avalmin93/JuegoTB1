package org.JuegoTB1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Isla isla = new Isla(7, 7); // Tamaño de la isla

        // Inicializar animales
        isla.agregarAnimal(new Lobo());
        isla.agregarAnimal(new Boa());
        isla.agregarAnimal(new Cocodrilo());
        //isla.agregarAnimal(new Caballo());
        //isla.agregarAnimal(new Conejo());

        // Inicializar plantas
        isla.hacerCrecimientoPlantas(); // Plantas en coordenada (3, 3)
        //isla.agregarPlanta(4, 4, 30); // Plantas en coordenada (4, 4)

        // Iniciar simulación
        isla.iniciarSimulacion(1); // Duración de 1 minuto

        isla.mostrarEstadisticas();
    }
}
