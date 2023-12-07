package factory;

public class PC extends Calculator {

    private String ram;
    private String hdd;

    public PC(String ram, String hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String getRam() {
        return "pc " + ram;
    }

    @Override
    public String getHDD() {
        return "pc " + hdd;
    }
}
