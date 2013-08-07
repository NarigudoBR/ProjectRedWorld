package NarigudoBR.ProjectRedWorld.items;

import NarigudoBR.ProjectRedWorld.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class industrialIron extends Item {

	public industrialIron(int par1) {
		super(par1);
		
	}
	@Override
    @SideOnly(Side.CLIENT)

    public void registerIcons(IconRegister reg){
	    this.itemIcon = reg.registerIcon("sniffcraft:industrialIron");
	    this.setCreativeTab(main.ProjectRedWorldTab);
	    this.setUnlocalizedName("IndustrialIron");
     }

}
