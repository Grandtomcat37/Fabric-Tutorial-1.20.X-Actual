package net.christian.tutorialmod.block;

import net.christian.tutorialmod.TutorialMod;
import net.christian.tutorialmod.block.custom.SoundBlock_High_Pitch_Explosion;
import net.christian.tutorialmod.block.custom.SoundBlock_Low_Pitch_Explosion;
import net.christian.tutorialmod.block.custom.SoundBlock_Normal_Pitch_Explosion;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.GLASS)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.ANVIL).strength(2f), UniformIntProvider.create(45, 150)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(4f), UniformIntProvider.create(100, 200)));
    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).sounds(BlockSoundGroup.FROGSPAWN).strength(1.5f), UniformIntProvider.create(45, 150)));
    public static final Block END_STONE_RUBY_ORE = registerBlock("end_stone_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).sounds(BlockSoundGroup.WEEPING_VINES).strength(4f), UniformIntProvider.create(800, 1000)));

    public static final Block SOUND_BLOCK_LOW_EXPLOSION = registerBlock("sound_block_low_explosion",
            new SoundBlock_Low_Pitch_Explosion(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.ANCIENT_DEBRIS)));
    public static final Block SOUND_BLOCK_NORMAL_EXPLOSION = registerBlock("sound_block_normal_explosion",
            new SoundBlock_Normal_Pitch_Explosion(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.FROGSPAWN)));
    public static final Block SOUND_BLOCK_HIGH_EXPLOSION = registerBlock("sound_block_high_explosion",
            new SoundBlock_High_Pitch_Explosion(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBLocks(){
        TutorialMod.LOGGER.info("RegisteringModBlocks for " + TutorialMod.MOD_ID);
    }
}
