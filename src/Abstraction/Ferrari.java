package Abstraction;

public class Ferrari extends Car {

    @Override
    public void repair() {
        System.out.println("Noice ferrari");
    }
    @Override
    public void price(){
        System.out.println("Price is 8 million for Ferrari");
    }
}
