
    public class Veiculo
{
    // Atributos
    private String marca;
    private String modelo;
    private int ano;

    // Metodo Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Veiculo() {

    }

    // Metodo marca
    public String getMarca() {
        return marca;
    }

    // Metodo modelo
    public String getModelo() {
        return modelo;
    }

    // Metodo ano
    public int getAno() {
        return ano;
    }
    // Metodo toString
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;

    }
}

