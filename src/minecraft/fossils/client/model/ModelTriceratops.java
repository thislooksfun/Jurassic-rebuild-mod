// Date: 2011/11/6  11:14:48
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX





package fossils.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import fossils.entity.EntityDinosaurce;

public class ModelTriceratops extends ModelDinosaurs
{
      //fields
    ModelRenderer noumenon1;
    ModelRenderer noumenon2;
    ModelRenderer noumenon3;
    ModelRenderer noumenon4;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer thigh_R1;
    ModelRenderer leg_R1;
    ModelRenderer thigh_L1;
    ModelRenderer leg_L1;
    ModelRenderer thigh_R2;
    ModelRenderer leg_R2;
    ModelRenderer thigh_L2;
    ModelRenderer leg_L2;
    ModelRenderer horn_3;
    ModelRenderer head1;
    ModelRenderer head11;
    ModelRenderer horn_1_R;
    ModelRenderer horn_2_L;
    ModelRenderer horn_1_R1;
    ModelRenderer horn_1_R2;
      
      public ModelTriceratops()
      {
        noumenon1 = new ModelRenderer(this, 42, 0);
        noumenon1.addBox(-3F, -3F, -2F, 6, 5, 5);
        noumenon1.setRotationPoint(0F, 20F, -1F);
        SetRotation(noumenon1, 0F, 0F, 0F);
        noumenon2 = new ModelRenderer(this, 48, 10);
        noumenon2.addBox(-2.5F, -0.2F, 0F, 5, 4, 3);
        noumenon2.setRotationPoint(0F, 18F, 2F);
        SetRotation(noumenon2, -0.2712F, 0F, 0F);
        noumenon3 = new ModelRenderer(this, 54, 17);
        noumenon3.addBox(-1.5F, 0F, 3F, 3, 2, 2);
        noumenon3.setRotationPoint(0F, 18F, 2F);
        SetRotation(noumenon3, -0.4519F, 0F, 0F);
        noumenon4 = new ModelRenderer(this, 54, 21);
        noumenon4.addBox(-1F, 2F, 4F, 2, 1, 3);
        noumenon4.setRotationPoint(0F, 18F, 2F);
        SetRotation(noumenon4, -0.1808F, 0F, 0F);
        head2 = new ModelRenderer(this, 0, 0);
        head2.addBox(-2F, -3F, -2F, 4, 4, 6);
        head2.setRotationPoint(0F, 21F, -5F);
        SetRotation(head2, 0.1396F, 0F, 0F);
        head3 = new ModelRenderer(this, 0, 10);
        head3.addBox(-1F, -2.5F, -3F, 2, 3, 3);
        head3.setRotationPoint(0F, 21F, -5F);
        SetRotation(head3, 0.81364F, 0F, 0F);
        thigh_R1 = new ModelRenderer(this, 0, 20);
        thigh_R1.addBox(-4F, 1F, -2F, 2, 2, 2);
        thigh_R1.setRotationPoint(0F, 19F, -2F);
        SetRotation(thigh_R1, 0F, 0F, 0F);
        leg_R1 = new ModelRenderer(this, 8, 19);
        leg_R1.addBox(-3F, 1F, -6F, 1, 2, 3);
        leg_R1.setRotationPoint(0F, 18F, -2F);
        SetRotation(leg_R1, 1F, 0F, 0F);
        thigh_L1 = new ModelRenderer(this, 0, 16);
        thigh_L1.addBox(2F, 2F, -2F, 2, 2, 2);
        thigh_L1.setRotationPoint(0F, 18F, -2F);
        SetRotation(thigh_L1, 0F, 0F, 0F);
        leg_L1 = new ModelRenderer(this, 16, 19);
        leg_L1.addBox(2F, 1F, -6F, 1, 2, 3);
        leg_L1.setRotationPoint(0F, 18F, -2F);
        SetRotation(leg_L1, 1F, 0F, 0F);
        thigh_R2 = new ModelRenderer(this, 0, 24);
        thigh_R2.addBox(-4F, 0F, -2F, 2, 4, 4);
        thigh_R2.setRotationPoint(0F, 18F, 2F);
        SetRotation(thigh_R2, 0F, 0F, 0F);
        leg_R2 = new ModelRenderer(this, 24, 19);
        leg_R2.addBox(-3F, 2F, -5F, 1, 2, 3);
        leg_R2.setRotationPoint(0F, 18F, 2F);
        SetRotation(leg_R2, 1F, 0F, 0F);
        thigh_L2 = new ModelRenderer(this, 12, 24);
        thigh_L2.addBox(2F, 0F, -2F, 2, 4, 4);
        thigh_L2.setRotationPoint(0F, 18F, 2F);
        SetRotation(thigh_L2, 0F, 0F, 0F);
        leg_L2 = new ModelRenderer(this, 32, 19);
        leg_L2.addBox(2F, 2F, -5F, 1, 2, 3);
        leg_L2.setRotationPoint(0F, 18F, 2F);
        SetRotation(leg_L2, 1F, 0F, 0F);
        horn_3 = new ModelRenderer(this, 24, 24);
        horn_3.addBox(-0.5F, 2F, -3F, 1, 1, 2);
        horn_3.setRotationPoint(0F, 21F, -5F);
        SetRotation(horn_3, -1.13F, 0F, 0F);
        head1 = new ModelRenderer(this, 20, 0);
        head1.addBox(-4F, -8F, 0F, 8, 7, 1);
        head1.setRotationPoint(0F, 21F, -5F);
        SetRotation(head1,-0.4F, 0F, 0F);
        head11 = new ModelRenderer(this, 20, 8);
        head11.addBox(-5F, -9F, 0F, 10, 8, 1);
        head11.setRotationPoint(0F, 21F, -5F);
        SetRotation(head11, -0.4F, 0F, 0F);
        horn_1_R = new ModelRenderer(this, 24, 27);
        horn_1_R.addBox(-2F, -4F, -3F, 1, 1, 4);
        horn_1_R.setRotationPoint(0F, 21F, -5F);
        SetRotation(horn_1_R, -0.31642F, 0F, 0F);
        horn_2_L = new ModelRenderer(this, 24, 27);
        horn_2_L.addBox(1F, -4F, -3F, 1, 1, 4);
        horn_2_L.setRotationPoint(0F, 21F, -5F);
        SetRotation(horn_2_L, -0.31642F, 0F, 0F);
        horn_1_R1 = new ModelRenderer(this, 33, 27);
        horn_1_R1.addBox(-2F, -4F, -6F, 1, 1, 4);
        horn_1_R1.setRotationPoint(0F, 21F, -5F);
        SetRotation(horn_1_R1, -0.31642F, 0F, 0F);
        horn_1_R2 = new ModelRenderer(this, 33, 27);
        horn_1_R2.addBox(1F, -4F, -6F, 1, 1, 4);
        horn_1_R2.setRotationPoint(0F, 21F, -5F);
        SetRotation(horn_1_R2, -0.31642F, 0F, 0F);
      }

      public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
      {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5,((EntityDinosaurce)entity).isModelized());
        noumenon1.render(f5);
        noumenon2.render(f5);
        noumenon3.render(f5);
        noumenon4.render(f5);
        head2.render(f5);
        head3.render(f5);
        thigh_R1.render(f5);
        leg_R1.render(f5);
        thigh_L1.render(f5);
        leg_L1.render(f5);
        thigh_R2.render(f5);
        leg_R2.render(f5);
        thigh_L2.render(f5);
        leg_L2.render(f5);
        horn_3.render(f5);
        head1.render(f5);
        head11.render(f5);
        horn_1_R.render(f5);
        horn_1_R1.render(f5);
        horn_2_L.render(f5);        
        horn_1_R2.render(f5);


      }
      public void renderRun(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
      {
        super.render(entity, f, f1, f2, f3, f4, f5);
        RunningPose(f, f1, f2, f3, f4, f5,((EntityDinosaurce)entity).isModelized());
        noumenon1.render(f5);
        noumenon2.render(f5);
        noumenon3.render(f5);
        noumenon4.render(f5);
        head2.render(f5);
        head3.render(f5);
        thigh_R1.render(f5);
        leg_R1.render(f5);
        thigh_L1.render(f5);
        leg_L1.render(f5);
        thigh_R2.render(f5);
        leg_R2.render(f5);
        thigh_L2.render(f5);
        leg_L2.render(f5);
        horn_3.render(f5);
        head1.render(f5);
        head11.render(f5);
        horn_1_R.render(f5);
        horn_1_R1.render(f5);
        horn_2_L.render(f5);        
        horn_1_R2.render(f5);


      }
      public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,boolean modelized)
      {
        if(modelized) return;
        //Head Yaw
    	/*head1.rotateAngleY = -f3 / 57.29578F;
    	head11.rotateAngleY = -f3 / 57.29578F;
    	head2.rotateAngleY = -f3 / 57.29578F;
    	head3.rotateAngleY = -f3 / 57.29578F;
    	horn_3.rotateAngleY = -f3 / 57.29578F;
        horn_1_R.rotateAngleY = -f3 / 57.29578F;
        horn_1_R1.rotateAngleY = -f3 / 57.29578F;
        horn_2_L.rotateAngleY = -f3 / 57.29578F;        
        horn_1_R2.rotateAngleY = -f3 / 57.29578F;*/
        
       noumenon2.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.174532925199433F * f1 + 0F ;
       noumenon3.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.261799387799149F * f1 + 0F ;
       noumenon4.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.349065850398866F * f1 + 0F ;
        thigh_R1.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.5F )) * -0.174532925199433F * f1 + 0F ;
       thigh_R1.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.0872664625997165F * f1 + 0F ;
        leg_R1.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.5F )) * -0.174532925199433F * f1 + 0.994460983870151F ;
       leg_R1.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.0872664625997165F * f1 + 0F ;
        thigh_L1.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.174532925199433F * f1 + 0F ;
       thigh_L1.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.0872664625997165F * f1 + 0F ;
        leg_L1.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.174532925199433F * f1 + 0.994460983870151F ;
       leg_L1.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.0872664625997165F * f1 + 0F ;
        thigh_R2.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.174532925199433F * f1 + 0F ;
       thigh_R2.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.0872664625997165F * f1 + 0F ;
        leg_R2.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.174532925199433F * f1 + 0.994460983870151F ;
       leg_R2.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.0872664625997165F * f1 + 0F ;
        thigh_L2.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.5F )) * -0.174532925199433F * f1 + 0F ;
       thigh_L2.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.0872664625997165F * f1 + 0F ;
        leg_L2.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.5F )) * -0.174532925199433F * f1 + 0.994460983870151F ;
       leg_L2.rotateAngleY = MathHelper.cos(f / (1.919107651F * 0.5F )) * 0.0872664625997165F * f1 + 0F ;
      }
      public void RunningPose(float f, float f1, float f2, float f3, float f4, float f5,boolean modelized){
          super.setRotationAngles(f, f1, f2, f3, f4, f5);
          if(modelized) return;
          noumenon1.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * 0.0872664625997165F * f1 + 0F ;
          noumenon2.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * 0.174532925199433F * f1 + -0.271216631964586F ;
          noumenon3.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * 0.261799387799149F * f1 + -0.452027719940978F ;
          noumenon4.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * 0.349065850398866F * f1 + -0.180811087976391F ;
          thigh_R1.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * -0.174532925199433F * f1 + 0F ;
          leg_R1.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * -0.174532925199433F * f1 + 0.994460983870151F ;
          thigh_L1.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * -0.261799387799149F * f1 + 0F ;
          leg_L1.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * -0.261799387799149F * f1 + 0.994460983870151F ;
          thigh_R2.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * 0.261799387799149F * f1 + 0F ;
          leg_R2.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * 0.261799387799149F * f1 + 0.994460983870151F ;
          thigh_L2.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * 0.174532925199433F * f1 + 0F ;
          leg_L2.rotateAngleX = MathHelper.cos(f / (1.919107651F * 0.33F )) * 0.174532925199433F * f1 + 0.994460983870151F ;
      }
      private void SetRotation(ModelRenderer model, float x, float y, float z)
      {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
      }
}
