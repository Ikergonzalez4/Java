public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Garfield");
        Fish fish = new Fish();
        Spider spider = new Spider();

        //llamar clase object
        Object obj = new Object();
        System.out.println(obj.toString());


        // Usando los métodos de la clase Cat
        System.out.println("Nombre del gato: " + cat.getName());
        cat.play();
        cat.eat();

        // Usando los métodos de la clase Fish
        fish.setName("Nemo");
        System.out.println("Nombre del pez: " + fish.getName());
        fish.play();
        fish.eat();

        // Usando los métodos de la clase Spider
        spider.eat();

        // Usando los métodos de la interfaz Pet
        Pet pet1 = cat;
        Pet pet2 = fish;

        System.out.println("Nombre de la mascota 1: " +  pet1.getName());
        pet1.play();

        System.out.println("Nombre de la mascota 2: " + pet2.getName());
        pet2.play();

        Cat cat1 = new Cat();
        cat1.setName("Garfield");
    }
}