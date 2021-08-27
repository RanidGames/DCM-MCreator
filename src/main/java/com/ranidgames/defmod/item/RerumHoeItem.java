
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import com.ranidgames.defmod.itemgroup.DCMToolsItemGroup;
import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class RerumHoeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:rerum_hoe")
	public static final Item block = null;
	public RerumHoeItem(DefinitiveContentModModElements instance) {
		super(instance, 129);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 5002;
			}

			public float getEfficiency() {
				return 22f;
			}

			public float getAttackDamage() {
				return 15f;
			}

			public int getHarvestLevel() {
				return 17;
			}

			public int getEnchantability() {
				return 119;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RerumItem.block));
			}
		}, 0, -3f, new Item.Properties().group(DCMToolsItemGroup.tab)) {
		}.setRegistryName("rerum_hoe"));
	}
}
