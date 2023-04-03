public class Cat extends Animal implements Pet {
    private String name;

    public Cat() {
        this("Sin nombre");
    }

    public Cat(String name) {
        super(4, TipoAnimal.MAMIFERO);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("El gato " + name + " está jugando.");
    }

    public void eat() {
        System.out.println("El gato " + name + " está comiendo.");
    }
}