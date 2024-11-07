package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic implements Omnivore<Food> {
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT) {
            System.out.println(getName() + " is eating meat.");
        }
    }

    @Override
    public void eatPlant(Food food) {
        if (food == Food.PLANT) {
            System.out.println(getName() + " is eating plants.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println(getName() + " is eating " + food);
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth=" + swimmingDepth;
    }
}
