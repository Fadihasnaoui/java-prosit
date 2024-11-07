package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic implements Omnivore<Food> {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) throws InvalidAgeException {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
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
        return super.toString() + ", Swimming Speed=" + swimmingSpeed;
    }
}
