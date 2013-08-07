package NarigudoBR.ProjectRedWorld.blocks;

import NarigudoBR.ProjectRedWorld.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class TungstenOre extends BlockOre {

	public TungstenOre(int tungstenOreBlockID) {
		super(tungstenOreBlockID);
		
		this.setHardness(3.0F);
		this.setStepSound(soundStoneFootstep);
		this.setUnlocalizedName("tungstenOre");
		this.setCreativeTab(main.ProjectRedWorldTab);
		
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg)
	
	{
		this.blockIcon = reg.registerIcon("sniffcraft:Tungsten_Ore");
		
		
	}

}
