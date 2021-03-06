// Date: 8/31/2013 12:49:43 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCompy extends ModelBase
{
  //fields
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer RightLeg;
    ModelRenderer LeftLeg;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer LeftThigh;
    ModelRenderer RightThigh;
    ModelRenderer Tail;
  
  public ModelCompy()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Neck = new ModelRenderer(this, 4, 4);
      Neck.addBox(-2F, -6F, -2F, 2, 4, 3);
      Neck.setRotationPoint(0F, 18F, -4F);
      Neck.setTextureSize(64, 32);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 14, 0);
      Head.addBox(-2F, -4F, -4F, 3, 3, 6);
      Head.setRotationPoint(-0.5F, 13F, -5F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 19);
      Body.addBox(-3F, -4F, -3F, 4, 8, 5);
      Body.setRotationPoint(0F, 16F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 1.570796F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 38, 0);
      RightLeg.addBox(-1F, 0F, -3F, 3, 5, 3);
      RightLeg.setRotationPoint(-4F, 19F, 4F);
      RightLeg.setTextureSize(64, 32);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 38, 0);
      LeftLeg.addBox(-1F, 0F, -3F, 3, 5, 3);
      LeftLeg.setRotationPoint(1F, 19F, 4F);
      LeftLeg.setTextureSize(64, 32);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 0, 0);
      RightArm.addBox(0F, 0F, -3F, 1, 3, 1);
      RightArm.setRotationPoint(-4F, 19F, -1F);
      RightArm.setTextureSize(64, 32);
      RightArm.mirror = true;
      setRotation(RightArm, -0.5205006F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 0, 0);
      LeftArm.addBox(-1F, 0F, -3F, 1, 3, 1);
      LeftArm.setRotationPoint(2F, 19F, -1F);
      LeftArm.setTextureSize(64, 32);
      LeftArm.mirror = true;
      setRotation(LeftArm, -0.5204921F, 0F, 0F);
      LeftThigh = new ModelRenderer(this, 38, 8);
      LeftThigh.addBox(0F, 0F, 0F, 1, 4, 2);
      LeftThigh.setRotationPoint(1F, 15F, 2F);
      LeftThigh.setTextureSize(64, 32);
      LeftThigh.mirror = true;
      setRotation(LeftThigh, 0F, 0F, 0F);
      RightThigh = new ModelRenderer(this, 38, 8);
      RightThigh.addBox(0F, 0F, 0F, 1, 4, 2);
      RightThigh.setRotationPoint(-4F, 15F, 2F);
      RightThigh.setTextureSize(64, 32);
      RightThigh.mirror = true;
      setRotation(RightThigh, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 18, 20);
      Tail.addBox(0F, 0F, 0F, 2, 2, 10);
      Tail.setRotationPoint(-2F, 14F, 4F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7){
  super.render(par1Entity, par2, par3, par4, par5, par6, par7);
  setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Neck.render(par7);
    Head.render(par7);
    Body.render(par7);
    RightLeg.render(par7);
    LeftLeg.render(par7);
    RightArm.render(par7);
    LeftArm.render(par7);
    LeftThigh.render(par7);
    RightThigh.render(par7);
    Tail.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }

}
