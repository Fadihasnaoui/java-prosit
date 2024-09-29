public class Zoo {
    // Attributs
    Animal[] animals;
    String name;
    String city;
    int nbrCages = 25;
    int animalCount;

    // Constructeur
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }


    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter de nouveaux animaux.");
            return false;
        }

        if (searchAnimal(animal.name) != -1) {
            System.out.println("Cet animal existe déjà dans le zoo.");
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }


    public void displayAnimals() {
        System.out.println("Les animaux du zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }


    public int searchAnimal(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1; // Si l'animal n'est pas trouvé
    }

    // Méthode pour supprimer un animal du zoo
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);
        if (index == -1) {
            return false; // Animal non trouvé
        }

        // Déplacer les animaux pour combler le trou
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z1.animalCount < z2.animalCount) {
            return z2;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}';
    }
}
