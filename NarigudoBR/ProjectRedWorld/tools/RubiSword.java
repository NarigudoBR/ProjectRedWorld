package NarigudoBR.ProjectRedWorld.tools;

import NarigudoBR.ProjectRedWorld.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class RubiSword extends ItemSword {

	public RubiSword(int rubiSwordID, EnumToolMaterial Rubi) {
		super(rubiSwordID, Rubi);
		
	}
	@Override
    @SideOnly(Side.CLIENT)

    public void registerIcons(IconRegister reg){
	    this.itemIcon = reg.registerIcon("sniffcraft:rubiSword");
	    this.setCreativeTab(main.ProjectRedWorldTab);
	    this.setUnlocalizedName("RubiSword");
     }
	

}
