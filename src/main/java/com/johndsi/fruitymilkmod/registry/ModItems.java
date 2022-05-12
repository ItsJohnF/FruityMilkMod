package com.johndsi.fruitymilkmod.registry;

import com.johndsi.fruitymilkmod.FruityMilkMod;
import net.minecraft.item.Item;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item MELON_MILK = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(1f).snack().build()));
    public static final Item REJUVINATING_MELON_MILK = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH), 1f).snack().alwaysEdible().build()));
    public static final Item BERRY_MILK = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(1f).snack().build()));
    public static final Item APPLE_MILK = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).snack().build()));
    public static final Item GOLDEN_APPLE_MILK = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,2400), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,100,1), 1f).snack().alwaysEdible().build()));
    public static final Item ENCHANTED_GOLDEN_APPLE_MILK = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,2400,3), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,400,1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,6000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,6000), 1f).snack().alwaysEdible().build()));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(FruityMilkMod.MOD_ID, "melon_milk"), MELON_MILK);
        Registry.register(Registry.ITEM, new Identifier(FruityMilkMod.MOD_ID, "rejuvinating_melon_milk"), REJUVINATING_MELON_MILK);
        Registry.register(Registry.ITEM, new Identifier(FruityMilkMod.MOD_ID, "berry_milk"), BERRY_MILK);
        Registry.register(Registry.ITEM, new Identifier(FruityMilkMod.MOD_ID, "apple_milk"), APPLE_MILK);
        Registry.register(Registry.ITEM, new Identifier(FruityMilkMod.MOD_ID, "golden_apple_milk"), GOLDEN_APPLE_MILK);
        Registry.register(Registry.ITEM, new Identifier(FruityMilkMod.MOD_ID, "enchanted_golden_apple_milk"), ENCHANTED_GOLDEN_APPLE_MILK);
    }

}
