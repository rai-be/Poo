
public class Motor {

    // Atributos
    private double potencia;
    private String tipo;

    // Construtor
    public Motor(double potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    // Métodos de acesso
    public double getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

