package Lesson07_Abstract_Interface.AbstractInterface;

public class Apple extends Fruit implements IEdible {

    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
