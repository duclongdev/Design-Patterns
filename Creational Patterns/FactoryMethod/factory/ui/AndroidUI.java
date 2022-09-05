package FactoryMethod.factory.ui;

import FactoryMethod.button.Button;
import FactoryMethod.button.buttonPlatform.AndButton;
import FactoryMethod.factory.UI;

public class AndroidUI extends UI {

    @Override
    public Button createButton() {
        return new AndButton();
    }

}
