package NarigudoBR.ProjectRedWorld.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import NarigudoBR.ProjectRedWorld.main;


public class TungstenIngot extends Item {

	public TungstenIngot(int par1) {
		super(par1);
		this.setMaxStackSize(64);
		this.setCreativeTab(main.ProjectRedWorldTab);
		this.setUnlocalizedName("tungstenIngot");
	}
	@Override
	@SideOnly(Side.CLIENT)
	
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("sniffcraft:tungstenIngot");
	}
	

}
