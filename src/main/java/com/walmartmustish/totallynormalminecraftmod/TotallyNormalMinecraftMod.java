package com.walmartmustish.totallynormalminecraftmod;

import net.minecraft.client.*;
import net.minecraft.crash.CrashReport;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = TotallyNormalMinecraftMod.MODID, version = TotallyNormalMinecraftMod.VERSION, clientSideOnly = true)
public class TotallyNormalMinecraftMod
{
    public static final String MODID = "totallynormalminecraftmod";
    public static final String VERSION = "1.0.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        Minecraft.getMinecraft().crashed(new CrashReport("get fucked lol", new RuntimeException("We’re no strangers to love,\n" +
            "You know the rules and so do I.\n" +
            "A full commitment’s what I’m thinking of,\n" +
            "You wouldn't get this from any other guy.\n" +
            "\n" +
            "I just wanna tell you how I’m feeling,\n" +
            "Gotta make you understand…\n" +
            "\n" +
            "Never gonna give you up,\n" +
            "Never gonna let you down,\n" +
            "Never gonna run around and desert you.\n" +
            "Never gonna make you cry,\n" +
            "Never gonna say goodbye,\n" +
            "Never gonna tell a lie and hurt you.\n" +
            "\n" +
            "We’ve known each other for so long\n" +
            "Your heart’s been aching\n" +
            "But you’re too shy to say it.\n" +
            "Inside we both know what’s been going on,\n" +
            "We know the game and we’re gonna play it.\n" +
            "\n" +
            "Annnnnd if you ask me how I’m feeling,\n" +
            "Don’t tell me you’re too blind to see…\n" +
            "\n" +
            "Never gonna give you up,\n" +
            "Never gonna let you down,\n" +
            "Never gonna run around and desert you.\n" +
            "Never gonna make you cry,\n" +
            "Never gonna say goodbye,\n" +
            "Never gonna tell a lie and hurt you.\n" +
            "\n" +
            "Never gonna give you up,\n" +
            "Never gonna let you down,\n" +
            "Never gonna run around and desert you.\n" +
            "Never gonna make you cry,\n" +
            "Never gonna say goodbye,\n" +
            "Never gonna tell a lie and hurt you.\n" +
            "\n" +
            "Give you up. give you up.\n" +
            "Give you up, give you up.\n" +
            "Never gonna give\n" +
            "Never gonna give, give you up.\n" +
            "Never gonna give\n" +
            "Never gonna give, give you up.\n" +
            "\n" +
            "We’ve known each other for so long\n" +
            "Your heart’s been aching\n" +
            "But you’re too shy to say it.\n" +
            "Inside we both know what’s been going on,\n" +
            "We know the game and we’re gonna play it.\n" +
            "\n" +
            "I just wanna tell you how I’m feeling,\n" +
            "Gotta make you understand…\n" +
            "\n" +
            "Never gonna give you up,\n" +
            "Never gonna let you down,\n" +
            "Never gonna run around and desert you.\n" +
            "Never gonna make you cry,\n" +
            "Never gonna say goodbye,\n" +
            "Never gonna tell a lie and hurt you.\n" +
            "\n" +
            "Never gonna give you up,\n" +
            "Never gonna let you down,\n" +
            "Never gonna run around and desert you.\n" +
            "Never gonna make you cry,\n" +
            "Never gonna say goodbye,\n" +
            "Never gonna tell a lie and hurt you.\n" +
            "\n" +
            "Never gonna give you up,\n" +
            "Never gonna let you down,\n" +
            "Never gonna run around and desert you.\n" +
            "Never gonna make you cry,\n" +
            "Never gonna say goodbye,\n" +
            "Never gonna tell a lie and hurt you.")));
        MinecraftForge.EVENT_BUS.register((this));
    }
}
