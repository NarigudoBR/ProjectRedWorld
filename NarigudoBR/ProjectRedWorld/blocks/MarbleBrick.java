package NarigudoBR.ProjectRedWorld.blocks;

import NarigudoBR.ProjectRedWorld.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class MarbleBrick extends Block {
	public MarbleBrick(int id,Material par1)
	{
		super(id,par1);
		this.setHardness(1.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("MarbleBrick");
		this.setCreativeTab(main.ProjectRedWorldTab);
		

	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("sniffcraft:MarbleBrick");
				
				
		
	}
	
}
