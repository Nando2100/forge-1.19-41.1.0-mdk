package net.nando.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nando.tutorialmod.Tutorialmod;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tutorialmod.MOD_ID);

    public static final RegistryObject<Item> Undying_Elytra = ITEMS.register("undying_elytra",()-> new Item(new Item.Properties().durability(648).tab(CreativeModeTab.TAB_TRANSPORTATION).rarity(Rarity.RARE)));




    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);

    }


}
