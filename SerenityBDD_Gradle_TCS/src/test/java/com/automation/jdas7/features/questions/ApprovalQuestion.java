package com.automation.jdas7.features.questions;

import com.automation.jdas7.features.ui.BuyUI;
import com.automation.jdas7.features.ui.RegisterUI;
import com.automation.jdas7.features.ui.SuccessUI;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ApprovalQuestion {

    public static Question<String> loginSuccess() {
        return actor -> Text.of(SuccessUI.TEXT_APPROVED).viewedBy(actor).asString();
    }

    public static Question<String> textForm() {
        return actor -> Text.of(RegisterUI.BUTTON_CAT).viewedBy(actor).asString();
    }

    public static Question<String> itemCartExist() {
        return actor -> Text.of(BuyUI.PRODUCT).viewedBy(actor).asString();
    }
}
