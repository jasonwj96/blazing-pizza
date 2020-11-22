package blazing.pizza.tasks;

import blazing.pizza.pages.OrdersPage;
import blazing.pizza.pages.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheOrdersPage() {
        return Task.where("navigates to the orders page", Open.browserOn().the(OrdersPage.class));
    }

    public static Performable toTheLoginPage() {
        return Task.where("navigates to the login page", Open.browserOn().the(LoginPage.class));
    }
}
