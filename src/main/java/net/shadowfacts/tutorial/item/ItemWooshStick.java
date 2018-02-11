package net.shadowfacts.tutorial.item;

import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.client.TutorialTab;
import net.shadowfacts.tutorial.item.tool.ItemSword;

public class ItemWooshStick extends ItemSword
{

    public ItemWooshStick()
    {
        super(ToolMaterial.IRON, "woosh_stick");
        this.setCreativeTab(TutorialMod.creativeTab);
    }

}
