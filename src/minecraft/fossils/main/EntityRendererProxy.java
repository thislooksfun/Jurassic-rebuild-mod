/*
 * Forge Mod Loader
 * Copyright (c) 2012-2013 cpw.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     cpw - implementation
 */

package fossils.main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;

public class EntityRendererProxy extends EntityRenderer
{
    public static final String fmlMarker = "This is an FML marker";
    private Minecraft game;

    public EntityRendererProxy(Minecraft minecraft)
    {
        super(minecraft);
        game = minecraft;
    }

    @Override

    /**
     * Will update any inputs that effect the camera angle (mouse) and then render the world and GUI
     */
    public void updateCameraAndRender(float tick)
    {
        super.updateCameraAndRender(tick);
        //This is where ModLoader does all of it's ticking
    }
}
