package NarigudoBR.ProjectRedWorld;

import java.util.Random;

import NarigudoBR.ProjectRedWorld.blocks.Marble;
import NarigudoBR.ProjectRedWorld.blocks.MarbleBrick;
import NarigudoBR.ProjectRedWorld.blocks.RubiOre;
import NarigudoBR.ProjectRedWorld.blocks.TungstenBlock;
import NarigudoBR.ProjectRedWorld.blocks.TungstenOre;
import NarigudoBR.ProjectRedWorld.creativetab.ProjectRedTab;
import NarigudoBR.ProjectRedWorld.items.TungstenIngot;
import NarigudoBR.ProjectRedWorld.items.gemRubi;
import NarigudoBR.ProjectRedWorld.items.industrialIron;
import NarigudoBR.ProjectRedWorld.tools.RubiAxe;
import NarigudoBR.ProjectRedWorld.tools.RubiHoe;
import NarigudoBR.ProjectRedWorld.tools.RubiPickaxe;
import NarigudoBR.ProjectRedWorld.tools.RubiShovel;
import NarigudoBR.ProjectRedWorld.tools.RubiSword;
import NarigudoBR.ProjectRedWorld.world.WorldGeneration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "projectredworld", name = "Project Red:Wolrd", version = "alpha 0.3")
@NetworkMod(clientSideRequired = true,serverSideRequired = true)
public class main
{
	public static main instance;
	//secao de id
	int marbleBlockID;
	int tungstenOreBlockID;
	int tungstenItemID;
	int marbleBrickID;
	int gemRubyID;
	int rubiOreID;
	
	int rubiPickaxeID;
	int rubiSwordID;
	int rubiShovelID;
	int rubiHoeID;
	int rubiAxeID;
	int industrialIronID;
	
	
	
	
	//secao dos blocos
	public static Block marbleBlock;
	public static Block tungstenOre;	
	public static Block marbleBrick;
	
	public static Block rubyOre;

	//secao dos items
	public static Item  tungstenIngot;
	public static Item gemRuby;
	public static Item industrialIron;
	//secao das ferramentas
	public static Item rubyPickaxe;
	public static Item rubySword;
	public static Item rubyShovel;
	public static Item rubyHoe;
	public static Item rubyAxe;
	//secao da creative tab
	public static CreativeTabs ProjectRedWorldTab = new ProjectRedTab(CreativeTabs.getNextID(),"Project Red : World");
	//secao materiais
	public static EnumToolMaterial Rubi= EnumHelper.addToolMaterial("Rubi", 3, 250, 8.0F,8.0F , 14);
       
        
	
	
	
		
     
	
	
			

 
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
	
		
		
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		
		//configuracao
		
		marbleBlockID = config.get("Block IDs","marbleBlock ID",1000).getInt();
		tungstenOreBlockID = config.get("Block IDS", "tungstenOre ID", 1001).getInt();
		tungstenItemID = config.get("Material IDs", "tungstenIngot", 1002).getInt();
		marbleBrickID = config.get("Block IDs", "marbleBrick", 1003).getInt();
		gemRubyID = config.get("Material IDs", "gemRubi", 1004).getInt();
		rubiOreID = config.get("Block IDs", "rubiOre", 1005).getInt();		
		rubiShovelID = config.get("BlockIDs","rubiShovel", 1007).getInt();
		rubiSwordID = config.get("ToolsIDs", "rubiSword", 1008).getInt();
		rubiPickaxeID = config.get("ToolsIDs", "rubiPickaxe", 1009).getInt();
		rubiHoeID = config.get("ToolsIDs", "rubiHoe", 1010).getInt();
		rubiAxeID = config.get("ToolsIDs", "rubiAxe", 1011).getInt();
		
		config.save();
		//iniciar  
		marbleBlock = new Marble(marbleBlockID,Material.rock);
		tungstenOre = new TungstenOre(tungstenOreBlockID);
		tungstenIngot = new TungstenIngot(tungstenItemID);
		marbleBrick = new MarbleBrick(marbleBrickID,Material.rock);
		gemRuby = new gemRubi(gemRubyID);
		rubyOre = new RubiOre(rubiOreID);		
		rubyPickaxe = new RubiPickaxe(rubiPickaxeID,Rubi);
		rubyShovel = new RubiShovel(rubiShovelID,Rubi);
		rubySword = new RubiSword(rubiSwordID,Rubi);
		rubyHoe = new RubiHoe(rubiHoeID,Rubi);
		rubyAxe = new RubiAxe(rubiAxeID,Rubi);		
	    industrialIron = new industrialIron(industrialIronID);
		//iniciar creative tab
		
		

   
   
    
			
			
		
		
		
	
    }
	
	
	
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	
	{
		 //local do marmore
		   LanguageRegistry.addName(marbleBlock, "Marble");
		   MinecraftForge.setBlockHarvestLevel(marbleBlock, "picaxe", 1);
		   GameRegistry.registerBlock(marbleBlock,"Marble");

		   //local do minerio de tungstenio
		    LanguageRegistry.addName(tungstenOre, "Tungsten ore");
		    MinecraftForge.setBlockHarvestLevel(tungstenOre, "pickaxe", 4);   
		    GameRegistry.registerBlock(tungstenOre,"Tungsten Ore");
		   
		      //local da barra de tungstenio
		    GameRegistry.registerItem(tungstenIngot, "Tungsten ingot");
		    LanguageRegistry.addName(tungstenIngot,"Tungsten ingot");
		    //local do bloco de marmore
		    LanguageRegistry.addName(marbleBrick, "Marble Brick");    
		    MinecraftForge.setBlockHarvestLevel(marbleBrick, "pickaxe", 1);
		    GameRegistry.registerBlock(marbleBrick, "Marble Brick");
		    //local do bloco de tungstenio
		   
		    //local do minerio de rubi
		    LanguageRegistry.addName(rubyOre, "Ruby Ore");
		    GameRegistry.registerBlock(rubyOre,"Ruby Ore");  
		    MinecraftForge.setBlockHarvestLevel(rubyOre, "pickaxe", 2);
		    //local da gema de rubi
		    GameRegistry.registerItem(gemRuby,"Ruby");
		    LanguageRegistry.addName(gemRuby, "Ruby");
		    //local das ferramentas de rubi
		    GameRegistry.registerItem(rubyPickaxe, "Ruby Pickaxe");
		    LanguageRegistry.addName(rubyPickaxe, "Ruby Pickaxe");
		    GameRegistry.registerItem(rubyShovel, "Ruby Shovel");
		    GameRegistry.registerItem(rubyAxe, "Ruby Axe");
		    GameRegistry.registerItem(rubyHoe, "Ruby Hoe");
		    GameRegistry.registerItem(rubySword, "Ruby Sword");
		    LanguageRegistry.addName(rubyAxe, "Ruby Axe");
		    LanguageRegistry.addName(rubyHoe, "Ruby Hoe");
		    LanguageRegistry.addName(rubyShovel, "Ruby Shovel");
		    LanguageRegistry.addName(rubySword, "Ruby Sword");
		    //local do ferro industrial
		    GameRegistry.registerItem(industrialIron, "Industrial Iron" );
		    LanguageRegistry.addName(industrialIron, "Industrial Iron");
		    
		    
		    
		    //receitas na fornalha
		    GameRegistry.addSmelting(tungstenOreBlockID,new ItemStack (tungstenIngot), 0.7f);
		    //receitas em crafting
		    GameRegistry.addShapedRecipe(new ItemStack (marbleBlock),"xx ","xx ","   ",'x',Block.cobblestone);
		    GameRegistry.addShapedRecipe(new ItemStack (marbleBrick),"xx ","xx ","   ",'x',marbleBlock);
		    GameRegistry.addShapedRecipe(new ItemStack (marbleBrick),"   ","xx ","xx ",'x',marbleBlock);		 
		    GameRegistry.addShapedRecipe(new ItemStack (marbleBrick)," xx"," xx","   ",'x',marbleBlock);		
		    GameRegistry.addShapedRecipe(new ItemStack (marbleBrick),"   ","xx ","xx ",'x',marbleBlock);
		    GameRegistry.addShapedRecipe(new ItemStack (marbleBlock),"   ","xx ","xx ",'x',Block.cobblestone);
		    GameRegistry.addShapedRecipe(new ItemStack (marbleBlock)," xx"," xx","   ",'x',Block.cobblestone);
		    GameRegistry.addShapedRecipe(new ItemStack (marbleBlock),"   "," xx"," xx",'x',Block.cobblestone);
		    GameRegistry.addShapedRecipe(new ItemStack (marbleBlock),"   ","xx ","xx ",'x',Block.cobblestone);
		    GameRegistry.addShapedRecipe(new ItemStack (rubyPickaxe),"xxx"," y "," y ",'x',gemRuby,'y',Item.stick);
		    GameRegistry.addShapedRecipe(new ItemStack (rubyHoe),"xx "," y "," y ",'x',gemRuby,'y',Item.stick);
		    GameRegistry.addShapedRecipe(new ItemStack (rubyAxe),"xx ","xy "," y ",'x',gemRuby,'y',Item.stick);
		    GameRegistry.addShapedRecipe(new ItemStack (rubySword)," x "," x "," y ",'x',gemRuby,'y',Item.stick);
		    GameRegistry.addShapedRecipe(new ItemStack (rubyShovel)," x "," y "," y ",'x',gemRuby,'y',Item.stick);
		    GameRegistry.addShapedRecipe(new ItemStack  (industrialIron,5)," y ","yxy"," y ",'x',Item.ingotIron,'y',Item.coal);
		    
		    
		    LanguageRegistry.instance().addStringLocalization("ProjectRedWorldTab", "Project Red:World");
		    //area de geracao de mundo
		    GameRegistry.registerWorldGenerator(new WorldGeneration());
		    //ore dictionary
		    OreDictionary.registerOre("gemRuby", gemRuby);
		    OreDictionary.registerOre("Ruby", gemRuby);
		    OreDictionary.registerOre("ingotRefinedIron", new ItemStack(industrialIron));
		    
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	@EventHandler
	public void serverStart(FMLServerStartingEvent event)
	{
		
	}
}
