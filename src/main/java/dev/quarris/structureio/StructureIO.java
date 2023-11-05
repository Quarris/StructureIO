package dev.quarris.structureio;

import dev.quarris.structureio.config.CommonConfig;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;

@Mod(ModRef.ID)
public class StructureIO {

    public StructureIO() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);
    }
}
