
public class Main {
    public static void main(String[] args) {


        // Criando um objeto engine
        Motor engine = new Motor(300, "gasolina");


        // Criando um objeto car
        Carro car = new Carro("Ford","Mustang", 1965, 2, engine);

        // Criando um objeto motorcycle
        Moto motorcycle = new Moto("Cônico", engine);


        System.out.println(car);
        System.out.println(motorcycle);
    }
}