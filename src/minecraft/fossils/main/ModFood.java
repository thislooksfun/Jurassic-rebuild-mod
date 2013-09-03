package fossils.main;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ModFood extends ItemFood {

	public ModFood(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		
	}
	
	public void registerIcons(IconRegister i) {
		
	itemIcon = i.registerIcon("fossils" + ":" + (this.getUnlocalizedName().substring(5)));
			
		
	}

}
