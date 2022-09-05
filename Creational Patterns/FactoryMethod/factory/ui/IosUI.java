package FactoryMethod.factory.ui;

import FactoryMethod.button.Button;
import FactoryMethod.button.buttonPlatform.IosButton;
import FactoryMethod.factory.UI;

public class IosUI extends UI {

    @Override
    public Button createButton() {
        return new IosButton();
    }

}
