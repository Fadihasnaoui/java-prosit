public class Main {
    public static void main(String[] args) {

        Zoo zoo1 = new Zoo("Safari Park", "Paris");
        Zoo zoo2 = new Zoo("Jungle Park", "Lyon");


        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal tiger = new Animal("Felidae", "Shere Khan", 4, true);
        Animal giraffe = new Animal("Giraffidae", "Melman", 7, false);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, false);


        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);
        zoo1.addAnimal(giraffe);


        zoo2.addAnimal(elephant);


        zoo1.displayAnimals();
        zoo2.displayAnimals();


        zoo1.removeAnimal(tiger);
        zoo1.displayAnimals();


        System.out.println("Le zoo 1 est plein ? " + zoo1.isZooFull());


        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);
        if (biggerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.name);
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }
    }
}
