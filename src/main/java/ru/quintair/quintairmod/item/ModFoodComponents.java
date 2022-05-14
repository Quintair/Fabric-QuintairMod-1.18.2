package ru.quintair.quintairmod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent SPRAT;

    public ModFoodComponents(){}

    static {
        SPRAT = (new FoodComponent.Builder().hunger(5).saturationModifier(0.3F).snack().meat().build());
    }
}


