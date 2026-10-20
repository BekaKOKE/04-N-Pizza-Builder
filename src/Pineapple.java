
public class Pineapple extends PizzaDecorator {

    private static final double PRICE = 1.5;

    public Pineapple(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pineapple";
    }

    @Override
    public double getCost() {
        return super.getCost() + PRICE;
    }
}
