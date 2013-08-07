package NarigudoBR.ProjectRedWorld.tools;

import NarigudoBR.ProjectRedWorld.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class RubiHoe extends ItemHoe {

	public RubiHoe(int rubiHoeID, EnumToolMaterial Rubi) {
		super(rubiHoeID,Rubi);
		
	}
	@Override
    @SideOnly(Side.CLIENT)

    public void registerIcons(IconRegister reg){
	    this.itemIcon = reg.registerIcon("sniffcraft:rubiHoe");
	    this.setCreativeTab(main.ProjectRedWorldTab);
	    this.setUnlocalizedName("RubiHoe");
     }

}
