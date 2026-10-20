import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String line = "============================================================";

        System.out.println(line);
        System.out.println(" CUSTOM PIZZA BUILDER (DECORATOR PATTERN)");
        System.out.println(line);

        Pizza plain = new PlainPizza();
        printPizza("Base pizza", plain);


        Pizza custom = new PlainPizza();
        custom = new Cheese(custom);
        custom = new Olives(custom);
        custom = new Pineapple(custom);
        printPizza("Custom pizza (Cheese + Olives + Pineapple)", custom);

        Pizza extraCheese = new Pineapple(new Cheese(new Cheese(new Olives(new PlainPizza()))));
        printPizza("Extra cheese pizza (Olives + 2x Cheese + Pineapple)", extraCheese);

        System.out.println(line);
    }

    private static void printPizza(String title, Pizza pizza) {
        System.out.println();
        System.out.println("--- " + title + " ---");
        System.out.println(" Description: " + pizza.getDescription());
        System.out.println(String.format(Locale.US, " Total cost:  $%.2f", pizza.getCost()));
    }
}
