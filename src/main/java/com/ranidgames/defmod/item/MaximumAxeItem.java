
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.ranidgames.defmod.itemgroup.DCMToolsItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class MaximumAxeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:maximum_axe")
	public static final Item block = null;
	public MaximumAxeItem(DefinitiveContentModModElements instance) {
		super(instance, 81);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2789;
			}

			public float getEfficiency() {
				return 17f;
			}

			public float getAttackDamage() {
				return 48f;
			}

			public int getHarvestLevel() {
				return 11;
			}

			public int getEnchantability() {
				return 78;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MaximumIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(DCMToolsItemGroup.tab)) {
		}.setRegistryName("maximum_axe"));
	}
}
