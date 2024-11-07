package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private int animalCount;
    private int aquaticCount;
    private final int maxCages = 3; // Réduit à 3 comme mentionné dans l'exercice.

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[maxCages];
        this.aquaticAnimals = new Aquatic[10]; // Peut contenir jusqu'à 10 animaux aquatiques.
        this.animalCount = 0;
        this.aquaticCount = 0;
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animalCount >= maxCages) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter un nouvel animal.");
        }

        // Ajouter l'animal
        this.animals[animalCount] = animal;
        animalCount++;
        System.out.println("Animal ajouté : " + animal);
    }

    public void addAquaticAnimal(Aquatic aquatic) throws ZooFullException {
        if (aquaticCount >= aquaticAnimals.length) {
            throw new ZooFullException("Le zoo ne peut pas contenir plus d'animaux aquatiques.");
        }

        // Ajouter l'animal aquatique
        this.aquaticAnimals[aquaticCount] = aquatic;
        aquaticCount++;
        System.out.println("Animal aquatique ajouté : " + aquatic);
    }

    public void displayAllAnimals() {
        System.out.println("Liste des animaux dans le zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public void displayAllAquaticAnimals() {
        System.out.println("Liste des animaux aquatiques dans le zoo " + name + " :");
        for (int i = 0; i < aquaticCount; i++) {
            System.out.println(aquaticAnimals[i]);
        }
    }

    public void swimAllAquaticAnimals() {
        System.out.println("Tous les animaux aquatiques sont en train de nager :");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].eatMeat(Food.MEAT); // Exemple d'action possible
            System.out.println(aquaticAnimals[i].getName() + " est en train de nager.");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
