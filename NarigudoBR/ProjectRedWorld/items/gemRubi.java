package NarigudoBR.ProjectRedWorld.items;

import NarigudoBR.ProjectRedWorld.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class gemRubi extends Item {

	public gemRubi(int par1) {
		super(par1);
		
	}

       @Override
       @SideOnly(Side.CLIENT)

       public void registerIcons(IconRegister reg){
	    this.itemIcon = reg.registerIcon("sniffcraft:gemRubi");
	    this.setCreativeTab(main.ProjectRedWorldTab);
	    this.setUnlocalizedName("gemRubi");
        }


}
