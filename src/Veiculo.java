
    public class Veiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Veiculo() {}

    // Metodo de acesso
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s, Modelo: %s, Ano: %d", getMarca(), getModelo(), getAno());
    }
}
