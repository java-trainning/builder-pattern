package BuilderPattern;

public class Application {

    public static void main(String[] args) {

        Pizza.Maker maker = new Pizza.Maker("large");

        Pizza pizza = maker.crust("ok").mayoBase("ok").make();
        System.out.println(pizza);

    }
}
