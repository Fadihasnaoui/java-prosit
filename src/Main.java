public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Felidae", "Lion", 5, true);

        Animal[] animals = new Animal[25];
        animals[0] = lion;

        Zoo myZoo = new Zoo("Safari Zoo", "Paris", 5, animals);

        System.out.println(myZoo);


        System.out.println(lion);
    }
}
