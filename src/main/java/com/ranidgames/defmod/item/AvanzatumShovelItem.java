
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.ranidgames.defmod.itemgroup.FantasysTabItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class AvanzatumShovelItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:avanzatum_shovel")
	public static final Item block = null;
	public AvanzatumShovelItem(DefinitiveContentModModElements instance) {
		super(instance, 118);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3216;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 12;
			}

			public int getEnchantability() {
				return 87;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AvanzatumIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(FantasysTabItemGroup.tab)) {
		}.setRegistryName("avanzatum_shovel"));
	}
}
