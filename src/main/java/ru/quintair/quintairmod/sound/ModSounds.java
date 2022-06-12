package ru.quintair.quintairmod.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.quintair.quintairmod.QuintairMod;

public class ModSounds {

    public static SoundEvent ENIGMATIC = registerSoundEvent("enigmatic");

    public static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(QuintairMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

}
