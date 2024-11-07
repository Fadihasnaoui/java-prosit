package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal implements Carnivore<Food>, Herbivore<Food> {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(getName() + " is eating meat.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT) {
            System.out.println(getName() + " is eating plant.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println(getName() + " is eating " + food);
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat=" + habitat;
    }
}
