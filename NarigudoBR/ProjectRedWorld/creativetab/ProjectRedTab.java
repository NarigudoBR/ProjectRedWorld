package NarigudoBR.ProjectRedWorld.creativetab;
 
import NarigudoBR.ProjectRedWorld.main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
 
public class ProjectRedTab extends CreativeTabs {
 
public ProjectRedTab(int position, String tabID) {
super(position, tabID);
}
 
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex()
{
        return main.marbleBlock.blockID;
}
public String getTranslatedTabLabel()
{
        return "Project Red:World";
}
}