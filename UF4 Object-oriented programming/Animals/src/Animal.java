public abstract class Animal {
    protected int legs;
    protected TipoAnimal tipoAnimal;

    public Animal(int legs, TipoAnimal tipoAnimal) {
        this.legs = legs;
        this.tipoAnimal = tipoAnimal;
    }

    public abstract void eat();

    public String toString() {
        return "Animal: " + tipoAnimal + " con " + legs + " patas.";
    }

    public void walk() {
        System.out.println("El animal está caminando.");
    }

    public void sleep() {
        System.out.println("El animal está durmiendo.");
    }

    public void run() {
        System.out.println("El animal está corriendo.");
    }

    public void jump() {
        System.out.println("El animal está saltando.");
    }

    public void swim() {
        System.out.println("El animal está nadando.");
    }

    public void fly() {
        System.out.println("El animal está volando.");
    }
}


