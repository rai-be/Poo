public class Carro extends Veiculo{


    // Atributos
        private int numero_de_portas;
    private Motor motor; //atributo de composição

    // Construtor
    public Carro(int numero_de_portas) {
        this.numero_de_portas = numero_de_portas;
    }

    // Método para obter o número de portas
    public int getNumero_de_portas() {
        return numero_de_portas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numero_de_portas=" + numero_de_portas + ", Motor: [" + motor + "]";

           // return super.toString() + ", Número de Portas: " + numeroDePortas + ", Motor: [" + motor + "]";
    }
}


