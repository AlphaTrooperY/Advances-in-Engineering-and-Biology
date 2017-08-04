package items;

import com.AlphaTrooperY.AdvEngBio.Refrence;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemCopperingot extends Item {

	public ItemCopperingot(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Refrence.MOD_ID, registryName));
	}
}
