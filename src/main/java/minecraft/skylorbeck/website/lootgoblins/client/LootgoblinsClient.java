package minecraft.skylorbeck.website.lootgoblins.client;

import me.shedaniel.autoconfig.AutoConfig;
import minecraft.skylorbeck.website.lootgoblins.GoblinConfig;
import minecraft.skylorbeck.website.lootgoblins.renderer.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import static minecraft.skylorbeck.website.lootgoblins.Declarer.*;

@Environment(EnvType.CLIENT)
public class LootgoblinsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AutoConfig.getGuiRegistry(GoblinConfig.class);

        EntityRendererRegistry.register(LOOT_SKELETON, LootSkeletonEntityRenderer::new);
        EntityRendererRegistry.register(LOOT_ENDERMAN, LootEndermanEntityRenderer::new);
        EntityRendererRegistry.register(LOOT_CREEPER, LootCreeperEntityRenderer::new);
        EntityRendererRegistry.register(LOOT_HOGLIN, LootHoglinEntityRenderer::new);
        EntityRendererRegistry.register(LOOT_ILLAGER, LootIllagerEntityRenderer::new);
        EntityRendererRegistry.register(LOOT_SPIDER, LootSpiderEntityRenderer::new);
        EntityRendererRegistry.register(LOOT_ZOMBIE, LootZombieEntityRenderer::new);
    }
}
