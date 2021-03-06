package mod.akrivus.amalgam.client.render;

import mod.akrivus.amalgam.client.model.ModelBubble;
import mod.akrivus.amalgam.client.render.layers.LayerBubbledItem;
import mod.akrivus.amalgam.entity.EntityBubble;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;

public class RenderBubble extends RenderLiving<EntityBubble> {
	public RenderBubble() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelBubble(), 0.0F);
		this.addLayer(new LayerBubbledItem(this));
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityBubble entity) {
		return new ResourceLocation("amalgam:textures/entities/white.png");
	}
}
