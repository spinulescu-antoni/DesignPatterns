package chain;

public class DispencerAmmoutBy50 implements DispencerAmmoutChain{

    private DispencerAmmoutChain next;


    @Override
    public void dispenceAmmout(Currency currency) {
        if (currency.getAmmout() < 50){
            next.dispenceAmmout(currency);
        }else {
            int numarBacntoe = currency.getAmmout() / 50;
            System.out.println("Numar bacnote de 50 : " + numarBacntoe);
            int rest = currency.getAmmout() % 50;
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
