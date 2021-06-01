package com.automation.jdas7.features.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyUI {

    public static final Target BUTTON_LAPTOPS= Target.the("boton laptops")
        .located(By.xpath("//*[@id=\"itemc\"][2]"));

    public static final Target MAC_BOOK_PRO = Target.the("Mac book pro")
        .located(By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a"));

    public static final Target ADD_TO_CART = Target.the("agregar a carrito")
        .located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));

    public static final Target CART = Target.the("boton cart")
        .located(By.xpath("//*[@id=\"cartur\"]"));

    public static final Target PRODUCT = Target.the("producto agregado")
        .located(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]"));

}
