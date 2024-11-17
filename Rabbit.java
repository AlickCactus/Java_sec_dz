public class Rabbit extends Animal{
    public Rabbit(String name_, String color_, int years_) {
        super(name_, color_, years_);
    }

    @Override
    public void say() {
        System.out.println("Thump");
    }
}
