
public class PlainPizza implements Pizza {

    private static final double BASE_PRICE = 5.0;

    @Override
    public String getDescription() {
        return "Plain Dough & Sauce";
    }

    @Override
    public double getCost() {
        return BASE_PRICE;
    }
}
