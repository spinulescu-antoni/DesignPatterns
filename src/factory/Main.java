package factory;

public class Main {
    public static void main(String[] args) {
        Calculator pc = ComputerFactory.getComputer(null,"16","500");
        Calculator server =ComputerFactory.getComputer(CalculatorType.SERVER,"6","250");

        System.out.println(pc);
        System.out.println(server);


    }
}
