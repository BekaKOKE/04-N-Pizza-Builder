import java.util.Objects;

public abstract class PizzaDecorator implements Pizza {

    protected final Pizza pizza;

    protected PizzaDecorator(Pizza pizza) {
        this.pizza = Objects.requireNonNull(pizza, "Pizza must not be null");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
