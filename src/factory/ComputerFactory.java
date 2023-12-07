package factory;

public class ComputerFactory {
    public static Calculator getComputer(CalculatorType type, String ram, String hdd){
        if (CalculatorType.PC.equals(type)){
            return new PC(ram, hdd);
        } else if (CalculatorType.SERVER.equals(type)) {
            return new Server(ram, hdd);
        }
        return null;
    }
}
