package Lesson07_Abstract_Interface.AbstractInterface;

public class Orange extends Fruit implements IEdible{

    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
