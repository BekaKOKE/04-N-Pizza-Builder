
public class Cheese extends PizzaDecorator {

    private static final double PRICE = 2.0;

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + PRICE;
    }
}
