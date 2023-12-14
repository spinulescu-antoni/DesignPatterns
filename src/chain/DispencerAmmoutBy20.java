package chain;

public class DispencerAmmoutBy20 implements DispencerAmmoutChain{
    private DispencerAmmoutChain next;

    @Override
    public void dispenceAmmout(Currency currency) {
        if (currency.getAmmout() < 20){
            this.next.dispenceAmmout(currency);
        }else {
            int numarBacnote = currency.getAmmout() / 20;
            System.out.println("Numar bacnote de 20: " + numarBacnote);
            int rest = currency.getAmmout() % 20;
            if (rest > 0){
                this.next.dispenceAmmout(new Currency(rest));
                System.out.println();
            }
        }
    }

    @Override
    public void setNext(DispencerAmmoutChain dispencerAmmoutChain) {
        this.next = dispencerAmmoutChain;
    }
}
