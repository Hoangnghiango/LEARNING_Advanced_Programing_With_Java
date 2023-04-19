package Lesson07_Abstract_Interface.AbstractInterface;

public class Chicken extends Animal implements IEdible {

    @Override
    public String makeSound() {
        return "CUC CUC";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
