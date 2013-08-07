package NarigudoBR.ProjectRedWorld.tools;

import NarigudoBR.ProjectRedWorld.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;

public class RubiPickaxe extends ItemPickaxe {

	public RubiPickaxe(int rubiPickaxeID, EnumToolMaterial Rubi) {
		super(rubiPickaxeID, Rubi);
		
	}
	@Override
    @SideOnly(Side.CLIENT)

    public void registerIcons(IconRegister reg){
	    this.itemIcon = reg.registerIcon("sniffcraft:rubiPickAxe");
	    this.setCreativeTab(main.ProjectRedWorldTab);
	    this.setUnlocalizedName("RubiPickAxe");
     }

	
	

}
