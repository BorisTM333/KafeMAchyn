interface CoffeeMachine {
    String prepareCoffee();
}

abstract class BaseCoffee implements CoffeeMachine {
    protected int water;
    protected int coffee;
    protected int milk;

    public BaseCoffee(int water, int coffee, int milk) {
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
    }
}
class Espresso extends BaseCoffee {
    public Espresso() {
        super(50, 1, 0);
    }
    @Override
    public String prepareCoffee() {
        return "Przygotowano Espresso: " + water + " ml wody, " + coffee + " porcja kawy.";
    }
}
class Latte extends BaseCoffee {
    public Latte() {
        super(30, 1, 150);
    }

    @Override
    public String prepareCoffee() {
        return "Przygotowano Latte: " + water + " ml wody, " + coffee + " porcja kawy, " + milk + " ml mleka.";
    }
}
class Cappuccino extends BaseCoffee {
    public Cappuccino() {
        super(30, 1, 100);
    }
    @Override
    public String prepareCoffee() {
        return "Przygotowano Cappuccino: " + water + " ml wody, " + coffee + " porcja kawy, " + milk + " ml mleka.";
    }
}

public class Main {
    public static void main(String[] args) {
                CoffeeMachine espresso = new Espresso();
                CoffeeMachine latte = new Latte();
                CoffeeMachine cappuccino = new Cappuccino();

                System.out.println(espresso.prepareCoffee());
                System.out.println(latte.prepareCoffee());
                System.out.println(cappuccino.prepareCoffee());

        }
    }
