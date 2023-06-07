package flechasPoo;

public class Procesos {
    Flecha flechal, flecha2, flecha3;

    public static void main(String[] args) {
        Procesos miPrincipal = new Procesos();
    }

    public Procesos() {
        flechal = new Flecha();
        flechal.construirFlecha();
        flechal.imprimirEspacio();

        flecha2 = new Flecha();
        flecha2.longitud = 34;
        flecha2.color = "rojo";
        flecha2.construirFlecha();
        flecha2.imprimirEspacio();

        flecha3 = new Flecha(12, "negro");
        flecha3.construirFlecha();
        flecha3.imprimirEspacio();
    }
}

