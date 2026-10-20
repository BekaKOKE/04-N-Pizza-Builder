
public class Olives extends PizzaDecorator {

    private static final double PRICE = 1.0;

    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + PRICE;
    }
}
