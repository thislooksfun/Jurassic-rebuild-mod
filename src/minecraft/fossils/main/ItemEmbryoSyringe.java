package fossils.main;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.ItemStack;



public class ItemEmbryoSyringe extends ForgeItem {
	private String[] ItemNames={
			"EmbyoPig","EmbyoSheep","EmbyoCow","EmbyoSaberCat","EmbyoMammoth"
	};
	protected ItemEmbryoSyringe(int i) {
		super(i);
		setHasSubtypes(true);
		setMaxDamage(0);
		maxStackSize=64;
		initItemNameVector();
	}
    private void initItemNameVector() {
		
		
	}
	public String getTextureFile()
    {
       return "/skull/needle.png";
    }
	
	public String getItemNameIS(ItemStack itemstack)
    {
			int tmp=itemstack.getItemDamage();
			if (tmp<this.ItemNames.length) return this.ItemNames[tmp];
			return "EmbyoSyring";
    }
	public static EnumEmbyos GetEmbyo(int index){
		return EnumEmbyos.values()[index];
	}

    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < EnumEmbyos.values().length; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}
