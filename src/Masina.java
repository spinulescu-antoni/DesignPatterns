

public class Masina {

    private String marca;
    private String culoare;

    public Masina(){}

    public Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public Masina setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Masina setCuloare(String culoare) {
        this.culoare = culoare;
        return this;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
