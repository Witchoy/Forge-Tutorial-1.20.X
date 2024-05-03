package net.witchoy.tutorial_mod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(1).fast()
            .saturationMod(0.15f).effect( ()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,
                    200), 0.1f).build();
}
