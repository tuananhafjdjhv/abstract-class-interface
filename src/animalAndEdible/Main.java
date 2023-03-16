package animalAndEdible;

import animalAndEdible.animals.Animal;
import animalAndEdible.animals.Chicken;
import animalAndEdible.animals.Tiger;
import animalAndEdible.fruit.Apple;
import animalAndEdible.fruit.Fruit;
import animalAndEdible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for (Animal abc: animals) {
            System.out.println(abc.makeSound());
            if (abc instanceof Chicken){
                System.out.println(((Chicken) abc).howToEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit abc: fruit) {
            System.out.println(abc.howToEat());
        }
    }
}
