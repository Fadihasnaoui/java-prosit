package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        try {
            Zoo zoo1 = new Zoo("Safari Park", "Paris");

            // Création des animaux
            Animal lion = new Animal("Felidae", "Simba", 5, true);
            Aquatic dolphin = new Dolphin("Cetacea", "Flipper", 3, true, "Ocean", 15.5f);
            Aquatic penguin = new Penguin("Spheniscidae", "Pingu", 2, false, "Antarctica", 50f);

            // Ajouter des animaux dans le zoo
            zoo1.addAnimal(lion);
            zoo1.addAquaticAnimal(dolphin);
            zoo1.addAquaticAnimal(penguin);

            // Afficher les animaux dans le zoo
            zoo1.displayAllAnimals();
            zoo1.displayAllAquaticAnimals();

            // Tester les méthodes de nage pour les animaux aquatiques
            zoo1.swimAllAquaticAnimals();

            // Afficher la profondeur maximale des pingouins
            System.out.println("Profondeur maximale de nage des pingouins : " + zoo1.maxPenguinSwimmingDepth());

            // Afficher le nombre d'animaux aquatiques par type
            zoo1.displayNumberOfAquaticsByType();

        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
