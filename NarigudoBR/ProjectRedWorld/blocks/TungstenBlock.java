package NarigudoBR.ProjectRedWorld.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class TungstenBlock extends Block {

	public TungstenBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setUnlocalizedName("tungstenBlock");
		
		
	}
	 
		// TODO Auto-generated constructor stub
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg)
	
	{
		this.blockIcon = reg.registerIcon("sniffcraft:TungstenBlock");
	}	

}
