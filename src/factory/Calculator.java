package factory;

public abstract class Calculator {
    public abstract String getRam();
    public abstract String getHDD();

    @Override
    public String toString() {
        return "RAM " + getRam() + " HDD " + getHDD();
    }
}
