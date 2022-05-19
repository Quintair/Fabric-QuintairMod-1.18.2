package ru.quintair.quintairmod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent CRANBERRY_CNACK;

    public ModFoodComponents(){}

    static {
        CRANBERRY_CNACK = (new FoodComponent.Builder().hunger(4).saturationModifier(0.15F).snack().build());
    }
}


