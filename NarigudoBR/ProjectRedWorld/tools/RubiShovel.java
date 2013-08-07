package NarigudoBR.ProjectRedWorld.tools;

import NarigudoBR.ProjectRedWorld.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemTool;

public class RubiShovel extends ItemSpade {

	

		public RubiShovel(int rubiShovelID,EnumToolMaterial Rubi){
		super(rubiShovelID, Rubi);
	}
		@Override
	       @SideOnly(Side.CLIENT)

	       public void registerIcons(IconRegister reg){
		    this.itemIcon = reg.registerIcon("sniffcraft:rubiShovel");
		    this.setCreativeTab(main.ProjectRedWorldTab);
		    this.setUnlocalizedName("RubiShovel");
	        }
		

}
