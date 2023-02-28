package dev.madcaker.quilt_dev_test.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItem implements ModInitializer {
	public static final Item EXAMPLE_ITEM = new Item(new QuiltItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize(ModContainer mod) {
	}
}
