package init;

import com.AlphaTrooperY.AdvEngBio.Refrence;

import items.ItemCopperingot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item copperingot;

	public static void init() {
		copperingot = new ItemCopperingot("copperingot", "copperingot");
	}
	
	public static void register() {
		GameRegistry.register(copperingot);
	}
	
	public static void registerRenders() {
		registerRender(copperingot);
	}
	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Refrence.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));

	}
}
