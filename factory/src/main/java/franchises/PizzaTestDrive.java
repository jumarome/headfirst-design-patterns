package franchises;

import franchises.chicago.ChicagoPizzaStore;
import franchises.newyork.NYPizzaStore;
import simple.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Juan order a "+pizza.getName()+" \n");

        pizza = chicagoStore.orderPizza("cheese");

        System.out.println("Sofia order a "+pizza.getName()+" \n");

    }
}
