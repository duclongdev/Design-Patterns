package FactoryMethod.factory;

import FactoryMethod.button.Button;

public abstract class UI {
    public void renderUI() {
        Button okButton = createButton();
        okButton.onPress();
    }

    public abstract Button createButton();
}
