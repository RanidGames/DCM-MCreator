
package com.ranidgames.defmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.ranidgames.defmod.DefinitiveContentModModElements;

@DefinitiveContentModModElements.ModElement.Tag
public class OrdinationAxeItem extends DefinitiveContentModModElements.ModElement {
	@ObjectHolder("definitive_content_mod:ordination_axe")
	public static final Item block = null;
	public OrdinationAxeItem(DefinitiveContentModModElements instance) {
		super(instance, 984);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 525;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 24;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(OrdinationItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ordination_axe"));
	}
}
