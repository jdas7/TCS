package com.automation.jdas7.features.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuccessUI {

    public static final Target TEXT_APPROVED = Target.the("Texto de bienvenida")
        .located(By.xpath("//*[@id=\"nameofuser\"]"));

}
