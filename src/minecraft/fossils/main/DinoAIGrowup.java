package fossils.main;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.DamageSource;

public class DinoAIGrowup extends EntityAIBase {
	private static final int GROW_TIME_COUNT = EntityDinosaurce.GROW_TIME_COUNT;
	protected EntityDinosaurce AITarget=null;
	protected int ageLimit=0;
	protected int healingOnGrowing=1;
	public DinoAIGrowup(EntityDinosaurce target,int limit){
		AITarget=target;
		this.ageLimit=limit;
	}
	public DinoAIGrowup(EntityDinosaurce target,int limit,int healingPoint){
		this(target,limit);
		this.healingOnGrowing=healingPoint;
	}
	public boolean shouldExecute() {
		if (!FossilOptions.DinoGrows) return false;
		if (AITarget.getDinoAge()>this.ageLimit) return false;
		AITarget.increaseDinoAgeTick();
		return (AITarget.getDinoAgeTick()>=GROW_TIME_COUNT);
	}
	public void updateTask() {
		AITarget.setDinoAgeTick(0);
		AITarget.increaseDinoAge();
		AITarget.CheckSkin();
		if (AITarget.prevHealth<( AITarget).prevHealth) AITarget.heal(healingOnGrowing);
		AITarget.updateSize(false);
		AITarget.setPosition(AITarget.posX,AITarget.posY,AITarget.posZ);
	if (!AITarget.CheckSpace()){	
		AITarget.decreaseDinoAge();
		this.AITarget.CheckSkin();
		if (AITarget.prevHealth>healingOnGrowing) AITarget.attackEntityFrom(DamageSource.generic, healingOnGrowing);
		AITarget.updateSize(false);
		AITarget.setPosition(AITarget.posX,AITarget.posY,AITarget.posZ);
		if (AITarget.isTamed()) AITarget.SendStatusMessage(EnumSituation.NoSpace,AITarget.SelfType); 
	}
	}

}
