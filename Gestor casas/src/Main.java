class Casa {
    String direccion;
    int habitaciones;
    boolean tieneJardin;

    public Casa(String direccion, int habitaciones, boolean tieneJardin) {
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.tieneJardin = tieneJardin;
    }

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = 3;
        this.tieneJardin = false;
    }

    public void mostrarInfo() {
        System.out.println("Casa en " + direccion + ", Habitaciones: " + habitaciones + ", ¿Tiene jardín?: " + tieneJardin);
    }

    public boolean esGrande() {
        return habitaciones > 4;
    }
}

public class Main {
    public static void main(String[] args) {
        Casa casaMario = new Casa("Calle Gastronómico 10", 5, true);
        Casa casaSamu = new Casa("Calle Isidrito 22", 3, false);

        casaMario.mostrarInfo();
        System.out.println("¿Es grande?: " + casaMario.esGrande());
        casaSamu.mostrarInfo();
        System.out.println("¿Es grande?: " + casaSamu.esGrande());
    }
}


