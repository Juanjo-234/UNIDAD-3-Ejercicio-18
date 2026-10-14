public class TanqueReserva {
    private double capacidadMaxima;
    private double nivelActual;

    public TanqueReserva(double capacidadMaxima) {
        if (capacidadMaxima > 0) {
            this.capacidadMaxima = capacidadMaxima;
        } else {
            this.capacidadMaxima = 200.0;
        }
        this.nivelActual = nivelActual;
    }

    public double getCapaciadMaxima() {
        return capacidadMaxima;
    }

    public double getNivelActual() {
        return nivelActual;
    }

    public void setCapaciadMaxima(double capaciadMaxima) {
        this.capacidadMaxima = capaciadMaxima;
    }

    public void setNivelActual(double nivelActual) {
        this.nivelActual = nivelActual;
    }

    public void llenar(double litros) {
        if (litros > 0 && (nivelActual + litros <= capacidadMaxima)) {
            nivelActual += litros;
        }else{
            System.out.println("Se ha alcanzado la capacidad maxima del tanque");
        }
    }

    public void consumir(double litros) {
        if (litros > 0 && (nivelActual - litros >= 0)) {
            nivelActual -= litros;
        }else{
            System.out.println("Se ha alcanzado el nivel minimo del tanque");
        }
    }
}
