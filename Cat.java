public class Cat extends Animal{
    private int owners;

    public Cat(int owners){
        this.owners = owners;
    }

    public Cat(String name_, String color_, int years_, int owners) {
        super(name_, color_, years_);
        this.owners = owners;
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
