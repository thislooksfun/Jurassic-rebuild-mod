package fossils.main;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSoup;

public class ModSoup extends ItemSoup {

	public ModSoup(int par1, int par2) {
		super(par1, par2);
		
	}
	
	@ Override
	public void registerIcons(IconRegister icon) {
		
	itemIcon = icon.registerIcon("fossils:Cooked_Chicken_Soup");	
		
	}

}
