package ru.quintair.quintairmod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent CRANBERRY_SNACK;
    public static final FoodComponent BALTIC_NINE;

    public ModFoodComponents(){}

    static {
        CRANBERRY_SNACK = (new FoodComponent.Builder().hunger(4).saturationModifier(0.15F).snack().build());
        BALTIC_NINE = (new FoodComponent.Builder().hunger(20).saturationModifier(0.5F).meat().alwaysEdible()
                .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(9), 1200, 1), 1F)
                .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(10), 600, 1), 1F)
                .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(11), 600, 0), 1F)
                .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(19), 200, 1), 0.5F).build());
    }
}


