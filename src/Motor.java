
public class Motor {

    // Atributos
    private int potencia;
    private String tipo;

    // Construtor
    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    // Métodos de acesso
    public int getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Potência: " + potencia + "Tipo: " + tipo;
    }

}


