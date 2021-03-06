package mod.akrivus.amalgam.client.render;

import mod.akrivus.amalgam.client.model.ModelInjector;
import mod.akrivus.amalgam.client.render.layers.LayerInjectorGlass;
import mod.akrivus.amalgam.entity.EntityInjector;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;

public class RenderInjector extends RenderLiving<EntityInjector> {
	public RenderInjector() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelInjector(), 0.0F);
		this.addLayer(new LayerInjectorGlass(this));
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityInjector entity) {
		return new ResourceLocation("amalgam:textures/entities/injector/injector.png");
	}
}
