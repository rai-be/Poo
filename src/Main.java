
public class Main {
    public static void main(String[] args) {

        // Criando um objeto vehicles

        Veiculo vehicles = new Veiculo("Chevrolet", "Corvette Stingray", 1963);
        Veiculo vehicles2 = new Veiculo("Ford", "Mustang", 1965 );

        // Criando um objeto engine
        Motor engine = new Motor(500, "V8");
        Motor engine2 = new Motor (495, "V8");

        // Criando um objeto car
        Carro car = new Carro(4);
        Carro car2 = new Carro(4);

        // Criando um objeto motorcycle
        Moto motorcycle = new Moto("Cônico");
        Moto motorcycle2 = new Moto("Ape Hanger");

        System.out.println(vehicles);
        System.out.println(vehicles2);
        System.out.println(engine);
        System.out.println(engine2);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(motorcycle);
        System.out.println(motorcycle2);
    }
}