package chain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DispencerAmmoutChain dispencerAmmoutChain50 = new DispencerAmmoutBy50();
        DispencerAmmoutChain dispencerAmmoutChain20 = new DispencerAmmoutBy20();
        DispencerAmmoutChain dispencerAmmoutChain10 = new DispencerAmmoutBy10();

        dispencerAmmoutChain50.setNext(dispencerAmmoutChain20);
        dispencerAmmoutChain20.setNext(dispencerAmmoutChain10);
        Scanner scanner = new Scanner(System.in);
        int suma = scanner.nextInt();
        if (suma % 10 != 0){
            System.out.println("Nu este multiplu de 10 ");
        }else{
            Currency currency = new Currency(suma);
            dispencerAmmoutChain50.dispenceAmmout(currency);
        }
    }
}
