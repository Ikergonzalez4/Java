public class Fish extends Animal implements Pet {
    private String name;

    public Fish() { 
        super(0, TipoAnimal.MAMIFERO);
    }

    public void eat() {
        System.out.println("El pez " + name + " está comiendo.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("El pez " + name + " está jugando.");
    }
}