package ru.quintair.quintairmod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent CRANBERRY_COOKIES;
    public static final FoodComponent BALTIC_NINE;

    static {
        CRANBERRY_COOKIES = (new FoodComponent.Builder().hunger(4).saturationModifier(0.15F).snack().build());
        BALTIC_NINE = (new FoodComponent.Builder().hunger(20).saturationModifier(0.5F).meat().alwaysEdible()
                .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(9), 600, 1), 1F)
                .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(10), 200, 1), 1F)
                .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(11), 200, 0), 1F)
                .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(19), 100, 1), 0.2F).build());
    }
}
