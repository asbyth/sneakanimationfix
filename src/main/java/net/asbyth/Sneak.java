package net.asbyth;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "sneakanimationfix", name = "Sneak Animation Fix", version = "1.0")
public class Sneak {

    public static boolean enabled = true;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Sneak Animation Fix initialized");
    }
}
