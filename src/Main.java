public class Main {

    public static void main(String[] args) {
//        ConexiuneBazaDateSinleton conexiune1 = ConexiuneBazaDateSinleton.getInstance();
//        System.out.println(conexiune1);
//
//        ConexiuneBazaDateSinleton conexiune2 = ConexiuneBazaDateSinleton.getInstance();
//        System.out.println(conexiune2);
//
//        if (conexiune1 == conexiune2){
//            System.out.println("Au aceasi adresa");
//        } else {
//            System.out.println("Nu au aceasi adresa");
//        }

        Masina masina1 = new Masina("Dacia","alba");
        Masina masina2 = masina1; // shllow copy
        masina1.setMarca("Bmw");
        System.out.println(masina1);
        System.out.println(masina2);

        Masina masina3 = new Masina().setMarca(masina1.getMarca()).setCuloare(masina1.getCuloare());
        masina3.setCuloare("Rosu");
        System.out.println(masina3);

//        masina3.setMarca(masina1.getMarca());
//        masina3.setCuloare(masina1.getCuloare());
    }

}