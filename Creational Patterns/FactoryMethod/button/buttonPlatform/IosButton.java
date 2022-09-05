package FactoryMethod.button.buttonPlatform;

import FactoryMethod.button.Button;

public class IosButton implements Button {

    @Override
    public void onPress() {
        System.out.println("Here is Ios Button");
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub

    }

}
