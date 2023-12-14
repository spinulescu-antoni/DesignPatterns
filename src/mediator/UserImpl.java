package mediator;

public class UserImpl extends User{


    public UserImpl(String name, ChatMediator chatMediator) {
        super(name, chatMediator);
    }

    @Override
    public void send(String mesaj) {
        System.out.println(this.name +" trimite mesajul : " + mesaj);
        chatMediator.sendMessage(mesaj,this);
    }

    @Override
    public void receive(String mesaj) {
        System.out.println(this.name + " a primit mesajul " + mesaj);
    }
}
