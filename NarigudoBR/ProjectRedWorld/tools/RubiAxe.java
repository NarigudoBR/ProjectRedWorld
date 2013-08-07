package NarigudoBR.ProjectRedWorld.tools;

import NarigudoBR.ProjectRedWorld.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class RubiAxe extends ItemAxe {

	public RubiAxe(int rubiAxeID, EnumToolMaterial Rubi) {
		super(rubiAxeID, Rubi);
		
	}
	@Override
    @SideOnly(Side.CLIENT)

    public void registerIcons(IconRegister reg){
	    this.itemIcon = reg.registerIcon("sniffcraft:rubiAxe");
	    this.setCreativeTab(main.ProjectRedWorldTab);
	    this.setUnlocalizedName("RubiAxe");
     }

}
