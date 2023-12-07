public class ConexiuneBazaDateSinleton {

    private String nume;

    private static ConexiuneBazaDateSinleton instance;
    private ConexiuneBazaDateSinleton(){
        this.nume = "Baza de date principala";
    };
    public static ConexiuneBazaDateSinleton getInstance(){
        if (instance== null){
            instance = new ConexiuneBazaDateSinleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDateSinleton{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
