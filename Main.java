public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Vasa", "gray", 2);
        cat.getName();
        cat.getColor();
        cat.getYears();
        cat.say();

        Animal dog = new Animal("Sharik", "black", 5);
        dog.getName();
        dog.getColor();
        dog.getYears();
        dog.say();

        Animal rabbit = new Animal("Daisy", "orange", 7);
        rabbit.getName();
        rabbit.getColor();
        rabbit.getYears();
        rabbit.say();

        Animal hamster = new Animal("Ham", "yellow", 1);
        hamster.getName();
        hamster.getColor();
        hamster.getYears();
        hamster.say();
    }
}
