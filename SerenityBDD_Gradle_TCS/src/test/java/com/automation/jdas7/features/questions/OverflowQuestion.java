package com.automation.jdas7.features.questions;

import com.automation.jdas7.features.ui.RegisterUI;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class OverflowQuestion {

    public static Question<String> textForm() {
        return actor -> Text.of(RegisterUI.BUTTON_CAT).viewedBy(actor).asString();
    }
}
