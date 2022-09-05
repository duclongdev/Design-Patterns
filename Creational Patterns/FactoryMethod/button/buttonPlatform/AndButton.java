package FactoryMethod.button.buttonPlatform;

import FactoryMethod.button.Button;

public class AndButton implements Button {

    @Override
    public void onPress() {
        System.out.println("Here is Android button");
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub
    }

}
