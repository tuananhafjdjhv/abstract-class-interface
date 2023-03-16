package animalAndEdible.animals;

import animalAndEdible.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound(){
        return "Chicken: cuc ta cuc tac";
    }
    @Override
    public String howToEat(){
        return "da xong";
    }
}
