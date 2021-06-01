package com.automation.jdas7.features.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactUI {

    public static final Target BUTTON_CONTACT= Target.the("boton contact")
        .located(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"));

    public static final Target EMAIL = Target.the("Contact Email")
        .located(By.xpath("//*[@id=\"recipient-email\"]"));

    public static final Target NAME = Target.the("Contact Name")
        .located(By.xpath("//*[@id=\"recipient-name\"]"));

    public static final Target MESSAGE = Target.the("Message")
        .located(By.xpath("//*[@id=\"message-text\"]"));

    public static final Target BUTTON_SEND = Target.the("boton send message")
        .located(By.xpath("//*[@id=\"exampleModal\"]/div/div//button[2]"));

}
