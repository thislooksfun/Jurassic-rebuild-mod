// Date: 8/31/2013 5:08:02 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fossils.main;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCryo extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer LowerJaw;
    ModelRenderer UpperJaw;
    ModelRenderer Teeth;
    ModelRenderer Crest;
    ModelRenderer Neck;
    ModelRenderer UpperBody;
    ModelRenderer LowerBody;
    ModelRenderer Tail;
    ModelRenderer Tail2;
    ModelRenderer Thigh;
    ModelRenderer Thigh2;
    ModelRenderer Calve;
    ModelRenderer Calve2;
    ModelRenderer Foot;
    ModelRenderer Foot2;
    ModelRenderer UpperArm;
    ModelRenderer UpperArm2;
    ModelRenderer Lower_Arm;
    ModelRenderer Lower_Arm2;
  
  public ModelCryo()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Head = new ModelRenderer(this, 16, 0);
      Head.addBox(0F, 0F, 0F, 4, 4, 4);
      Head.setRotationPoint(-2F, 7F, -10F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      LowerJaw = new ModelRenderer(this, 0, 9);
      LowerJaw.addBox(0F, 0F, 0F, 2, 1, 6);
      LowerJaw.setRotationPoint(-1F, 10.5F, -14F);
      LowerJaw.setTextureSize(64, 64);
      LowerJaw.mirror = true;
      setRotation(LowerJaw, 0F, 0F, 0F);
      UpperJaw = new ModelRenderer(this, 0, 0);
      UpperJaw.addBox(0F, 0F, 0F, 3, 4, 5);
      UpperJaw.setRotationPoint(-1.5F, 7F, -15F);
      UpperJaw.setTextureSize(64, 64);
      UpperJaw.mirror = true;
      setRotation(UpperJaw, 0.0872665F, 0F, 0F);
      Teeth = new ModelRenderer(this, 0, 44);
      Teeth.addBox(0F, 0F, 0F, 3, 1, 4);
      Teeth.setRotationPoint(-1.5F, 10.9F, -14.6F);
      Teeth.setTextureSize(64, 64);
      Teeth.mirror = true;
      setRotation(Teeth, 0.0872665F, 0F, 0F);
      Crest = new ModelRenderer(this, 14, 0);
      Crest.addBox(0F, 0F, 0F, 3, 4, 0);
      Crest.setRotationPoint(-1.5F, 3.3F, -10F);
      Crest.setTextureSize(64, 64);
      Crest.mirror = true;
      setRotation(Crest, -0.1047198F, 0F, 0F);
      Neck = new ModelRenderer(this, 32, 0);
      Neck.addBox(0F, 0F, 0F, 3, 4, 6);
      Neck.setRotationPoint(-1.5F, 7F, -7F);
      Neck.setTextureSize(64, 64);
      Neck.mirror = true;
      setRotation(Neck, -0.3141593F, 0F, 0F);
      UpperBody = new ModelRenderer(this, 0, 16);
      UpperBody.addBox(0F, 0F, 0F, 5, 7, 6);
      UpperBody.setRotationPoint(-2.5F, 8.5F, -2F);
      UpperBody.setTextureSize(64, 64);
      UpperBody.mirror = true;
      setRotation(UpperBody, -0.122173F, 0F, 0F);
      LowerBody = new ModelRenderer(this, 0, 29);
      LowerBody.addBox(0F, 0F, 0F, 7, 8, 7);
      LowerBody.setRotationPoint(-3.5F, 9F, 3F);
      LowerBody.setTextureSize(64, 64);
      LowerBody.mirror = true;
      setRotation(LowerBody, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 38, 10);
      Tail.addBox(0F, 0F, 0F, 5, 5, 8);
      Tail.setRotationPoint(-2.5F, 9F, 10F);
      Tail.setTextureSize(64, 64);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 22, 14);
      Tail2.addBox(0F, 0F, 0F, 3, 3, 9);
      Tail2.setRotationPoint(-1.5F, 9F, 18F);
      Tail2.setTextureSize(64, 64);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      Thigh = new ModelRenderer(this, 21, 26);
      Thigh.addBox(0F, 0F, 0F, 3, 6, 4);
      Thigh.setRotationPoint(3.5F, 12F, 6F);
      Thigh.setTextureSize(64, 64);
      Thigh.mirror = true;
      setRotation(Thigh, 0F, 0F, 0F);
      Thigh2 = new ModelRenderer(this, 21, 26);
      Thigh2.addBox(0F, 0F, 0F, 3, 6, 4);
      Thigh2.setRotationPoint(-6.5F, 12F, 6F);
      Thigh2.setTextureSize(64, 64);
      Thigh2.mirror = true;
      setRotation(Thigh2, 0F, 0F, 0F);
      Calve = new ModelRenderer(this, 35, 26);
      Calve.addBox(0F, 0F, 0F, 2, 7, 2);
      Calve.setRotationPoint(3.5F, 16F, 9F);
      Calve.setTextureSize(64, 64);
      Calve.mirror = true;
      setRotation(Calve, -0.2094395F, 0F, 0F);
      Calve2 = new ModelRenderer(this, 35, 26);
      Calve2.addBox(0F, 0F, 0F, 2, 7, 2);
      Calve2.setRotationPoint(-5.5F, 16F, 9F);
      Calve2.setTextureSize(64, 64);
      Calve2.mirror = true;
      setRotation(Calve2, -0.2094395F, 0F, 0F);
      Foot = new ModelRenderer(this, 50, 23);
      Foot.addBox(0F, 0F, 0F, 3, 2, 4);
      Foot.setRotationPoint(3.5F, 22F, 6F);
      Foot.setTextureSize(64, 64);
      Foot.mirror = true;
      setRotation(Foot, 0F, 0F, 0F);
      Foot2 = new ModelRenderer(this, 50, 23);
      Foot2.addBox(0F, 0F, 0F, 3, 2, 4);
      Foot2.setRotationPoint(-6.5F, 22F, 6F);
      Foot2.setTextureSize(64, 64);
      Foot2.mirror = true;
      setRotation(Foot2, 0F, 0F, 0F);
      UpperArm = new ModelRenderer(this, 10, 9);
      UpperArm.addBox(0F, 0F, 0F, 2, 3, 3);
      UpperArm.setRotationPoint(2.5F, 13F, -2.5F);
      UpperArm.setTextureSize(64, 64);
      UpperArm.mirror = true;
      setRotation(UpperArm, 0F, 0F, 0F);
      UpperArm2 = new ModelRenderer(this, 10, 9);
      UpperArm2.addBox(0F, 0F, 0F, 2, 3, 3);
      UpperArm2.setRotationPoint(-4.5F, 13F, -2.5F);
      UpperArm2.setTextureSize(64, 64);
      UpperArm2.mirror = true;
      setRotation(UpperArm2, 0F, 0F, 0F);
      Lower_Arm = new ModelRenderer(this, 20, 8);
      Lower_Arm.addBox(0F, 0F, 0F, 2, 3, 2);
      Lower_Arm.setRotationPoint(2.5F, 15F, -0.5F);
      Lower_Arm.setTextureSize(64, 64);
      Lower_Arm.mirror = true;
      setRotation(Lower_Arm, -0.4363323F, 0F, 0F);
      Lower_Arm2 = new ModelRenderer(this, 20, 8);
      Lower_Arm2.addBox(0F, 0F, 0F, 2, 3, 2);
      Lower_Arm2.setRotationPoint(-4.5F, 15F, -0.5F);
      Lower_Arm2.setTextureSize(64, 64);
      Lower_Arm2.mirror = true;
      setRotation(Lower_Arm2, -0.4363323F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
	super.render(par1Entity, par2, par3, par4, par5, par6, par7);
	setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Head.render(par7);
    LowerJaw.render(par7);
    UpperJaw.render(par7);
    Teeth.render(par7);
    Crest.render(par7);
    Neck.render(par7);
    UpperBody.render(par7);
    LowerBody.render(par7);
    Tail.render(par7);
    Tail2.render(par7);
    Thigh.render(par7);
    Thigh2.render(par7);
    Calve.render(par7);
    Calve2.render(par7);
    Foot.render(par7);
    Foot2.render(par7);
    UpperArm.render(par7);
    UpperArm2.render(par7);
    Lower_Arm.render(par7);
    Lower_Arm2.render(par7);
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
