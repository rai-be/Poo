public class Carro extends Veiculo {
    // Atributos
    private int numeroDePortas;
    private Motor motor;

    // Construtor
    public Carro(String marca, String modelo, int ano, int numeroDePortas, Motor motor) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
        this.motor = motor;
    }

    // Metodo de acesso
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return String.format("%s, Número de portas: %d, Motor: [%s]", super.toString(), getNumeroDePortas(), (motor != null ? motor.toString() : "não definido"));
    }
}
