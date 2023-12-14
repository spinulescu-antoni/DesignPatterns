package chain;

public class DispencerAmmoutBy10 implements DispencerAmmoutChain {

    private DispencerAmmoutChain next;
    @Override
    public void dispenceAmmout(Currency currency) {
        if (currency.getAmmout() < 10){
            System.out.println("Nu este multiplu de 10");
        }else {
            int numarBacnote = currency.getAmmout() / 10;
            System.out.println("Numar bacnote de 10 : " + numarBacnote);
            int rest = currency.getAmmout() % 10;
            if (rest > 0){
                next.dispenceAmmout(new Currency(rest));
            }
        }
    }

    @Override
    public void setNext(DispencerAmmoutChain dispencerAmmoutChain) {
        this.next = dispencerAmmoutChain;
    }
}
