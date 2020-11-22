package blazing.pizza.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UI {
    public static Target EMAIL_FIELD = Target.the("el campo de correo").located(By.id("Input_Email"));
    public static Target PASSWORD_FIELD = Target.the("el campo de contraseña").located(By.id("Input_Password"));
    public static Target LOGIN_BUTTON = Target.the("el boton de inicio de sesion").located(By.id("login-submit"));
    public static Target INVALID_LOGIN_MESSAGE = Target.the("el mensaje de inicio de sesion invalido")
            .located(By.xpath("//li[contains(text(),'Invalid login attempt.')]"));
    public static Target BUFFALO_CHICKEN_PIZZA_BUTTON = Target.the("el boton de pizza de pollo Buffalo")
            .located(By.xpath("//body/app[1]/div[2]/div[1]/ul[1]/li[1]/div[1]"));
    public static Target ADD_ORDER_BUTTON = Target.the("el boton de agregar orden")
            .located(By.xpath("/html[1]/body[1]/app[1]/div[2]/div[3]/div[1]/div[2]/button[2]"));
    public static Target CONFIRM_ORDER_LIST_BUTTON = Target.the("el boton de confirmar la lista de ordenes")
            .located(By.xpath("//a[contains(text(),'Order >')]"));
    public static Target SEND_ORDER_LIST_BUTTON = Target.the("el boton de enviar la lista de ordenes")
            .located(By.xpath("//button[contains(text(),'Place order')]"));
    public static Target DELIVER_TO_NAME_FIELD = Target.the("el campo de nombre del destinatario")
            .located(By.xpath("//body/app[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
    public static Target DELIVER_TO_LINE_1_FIELD = Target.the("el campo de linea 1 de direccion del destinatario")
            .located(By.xpath("//body/app[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]"));
    public static Target DELIVER_TO_LINE_2_FIELD = Target.the("el campo de linea 2 de direccion del destinatario")
            .located(By.xpath("//body/app[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/input[1]"));
    public static Target DELIVER_TO_CITY_FIELD = Target.the("el campo de ciudad del destinatario")
            .located(By.xpath("//body/app[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/input[1]"));
    public static Target DELIVER_TO_REGION_FIELD = Target.the("el campo de region del destinatario")
            .located(By.xpath("//body/app[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[5]/div[1]/input[1]"));
    public static Target DELIVER_TO_POSTAL_CODE_FIELD = Target.the("el campo de codigo postal del destinatario")
            .located(By.xpath("//body/app[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[6]/div[1]/input[1]"));
    public static Target ORDER_PLACED_TITLE = Target.the("el titulo de orden confirmada")
            .located(By.xpath("//body[1]/app[1]/div[2]/div[1]/div[1]/div[1]\n"));
}
