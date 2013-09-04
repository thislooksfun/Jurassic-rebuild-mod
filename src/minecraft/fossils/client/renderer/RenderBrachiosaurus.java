package fossils.client.renderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 
import org.lwjgl.opengl.GL12;

import fossils.entity.EntityBrachiosaurus;


public class RenderBrachiosaurus extends RenderLiving
{

	public RenderBrachiosaurus(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);

	}
	
	public void renderRex(EntityBrachiosaurus entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderRex((EntityBrachiosaurus)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderRex((EntityBrachiosaurus)par1Entity, par2, par4, par6, par8, par9);
    }

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {

		return new ResourceLocation("fossils:textures/mob/Brachiosaurus.png");
	}
}