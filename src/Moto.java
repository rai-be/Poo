
public class Moto extends Veiculo{


    // Atributos
    public String tipoDeGuidao;
    private Motor motor; //atributo de composição

    // Construtor
    public Moto(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }

    // Método
    private String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipoDeGuidao='" + tipoDeGuidao + '\'' +
                '}';
    }
}

