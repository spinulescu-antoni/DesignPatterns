package chain;

public interface DispencerAmmoutChain {
    public void dispenceAmmout(Currency currency);
    public void setNext(DispencerAmmoutChain dispencerAmmoutChain);
}
