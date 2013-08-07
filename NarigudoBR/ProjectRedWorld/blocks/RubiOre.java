package NarigudoBR.ProjectRedWorld.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import NarigudoBR.ProjectRedWorld.main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class RubiOre extends BlockOre {

	public RubiOre(int par1) {
		super(par1);
		
	}
	 public int idDropped(int par1, Random par2Random, int par3)
     {
     return main.gemRuby.itemID;
     }
     public int quantityDropped(Random random)
     {
             return 1;
     }
     @Override
     @SideOnly(Side.CLIENT)

     public void registerIcons(IconRegister reg){
	    this.blockIcon = reg.registerIcon("sniffcraft:rubiOre");
	    this.setCreativeTab(main.ProjectRedWorldTab);
	    this.setUnlocalizedName("rubiore");
	    this.setHardness(3.0F);
	    
	    
      }

}
