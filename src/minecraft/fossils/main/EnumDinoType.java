package fossils.main;

import fossils.entity.EntityBrachiosaurus;
import fossils.entity.EntityMosasaurus;
import fossils.entity.EntityNautilus;
import fossils.entity.EntityPlesiosaur;
import fossils.entity.EntityPterosaur;
import fossils.entity.EntityRaptor;
import fossils.entity.EntityStegosaurus;
import fossils.entity.EntityTRex;
import fossils.entity.EntityTriceratops;
import fossils.entity.Entitydil;

public enum EnumDinoType {
	Triceratops(EntityTriceratops.class,true),
	Raptor(EntityRaptor.class,false),
	TRex(EntityTRex.class,false),
	Pterosaur(EntityPterosaur.class,true),
	Nautilus(EntityNautilus.class,false),
	Plesiosaur(EntityPlesiosaur.class,true),
	Mosasaurus(EntityMosasaurus.class,false),
	Stegosaurus(EntityStegosaurus.class,false),
	dilphosaur(Entitydil.class,false),
	Brachiosaurus(EntityBrachiosaurus.class,true);
	private final Class dinoClass;
	private final boolean modelable; 

	private EnumDinoType(Class dinoClassVar,boolean modelableVar) {
		this.dinoClass = dinoClassVar;
		this.modelable=modelableVar;
	}
	public Class getDinoClass() {
		return dinoClass;
	}
	public boolean isModelable() {
		return modelable;
	}
}
