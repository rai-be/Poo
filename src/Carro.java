
public class Carro extends Veiculo {
    private int numeroDePortas;
    private Motor motor;

    // Atributos
        private int numero_de_portas;

    // Construtor
    public Carro(String marca,String modelo, int ano, int numero_de_portas, Motor motor) {
        super(marca, modelo, ano);
        this.numero_de_portas = numero_de_portas;
        this.motor = motor;
    }

    // Método numero de portas
    public int getNumero_de_portas() {
        return getNumero_de_portas();
    }
    // Método Motor
    public Motor getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Portas: " + numeroDePortas + ", Motor: [" + motor.toString() + "]";
    }
}

