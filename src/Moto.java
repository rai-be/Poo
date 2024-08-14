
public class Moto extends Veiculo{


    // Atributos
    public String tipoDeGuidao;
    private Motor motor; //atributo de composição

    // Construtor
    public Moto(String tipoDeGuidao, Motor motor) {
        super("Desconhecida", "Desconhecido", 0); // Ajuste conforme necessário
        this.tipoDeGuidao = tipoDeGuidao;
        this.motor = motor;
    }

    // Metodo tipo de guidão
    private String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(getMarca());
        sb.append(", Modelo: ").append(getModelo());
        sb.append(", Ano: ").append(getAno());
        sb.append(", Tipo de Guidão: ").append(tipoDeGuidao);
        if (motor != null) {
            sb.append(", Motor: ").append(motor); // Incluindo detalhes do motor se presente
        }
        return sb.toString();
    }

}


