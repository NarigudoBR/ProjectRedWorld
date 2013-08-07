package NarigudoBR.ProjectRedWorld.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Armor extends ItemArmor {
	private String texturePath = "sniffcraft:";
	private String iconPath = "sniffcraft:";
	
	public Armor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3,
			int par4, String type) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxStackSize(1);
		this.setArmorType(type.toLowerCase(),par4);
		
	}
	private void setArmorType(String type, int par4) {
		
		
	}
	//0=helmet
	//1=chestplate
	//2=leggins
	//3=boots
	private void SetArmorType(String type,int par4){
		switch(par4){		
		case 0:
			this.setUnlocalizedName(type +"Helmet");
			this.texturePath+=type+"_layer1_.png";
			this.iconPath+=type+"_helmet";
			break;
		case 1:
			this.setUnlocalizedName(type +"Helmet");
			this.texturePath+=type+"_layer1_.png";
			this.iconPath+=type+"_chest";
			break;
		case 2:
			this.setUnlocalizedName(type +"Helmet");
			this.texturePath+=type+"_layer2_.png";
			this.iconPath+=type+"_leggings";
			break;
		case 3:
			this.setUnlocalizedName(type +"Helmet");
			this.texturePath+=type+"_layer1_.png";
			this.iconPath+=type+"_boots";
			break;
		}
		
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon(this.iconPath);
	}
	public String getArmorTexture(ItemStack stack,Entity entity,int slot,int player){
		return this.texturePath;
	}

	


}
