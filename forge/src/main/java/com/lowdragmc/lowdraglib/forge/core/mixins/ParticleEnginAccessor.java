package com.lowdragmc.lowdraglib.forge.core.mixins;

import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(ParticleEngine.class)
public interface ParticleEnginAccessor {
    @Accessor("f_107293_")
    Map<ResourceLocation, ParticleProvider<?>> getProviders();

}
