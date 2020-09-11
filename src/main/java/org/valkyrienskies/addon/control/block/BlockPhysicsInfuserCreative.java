package org.valkyrienskies.addon.control.block;

import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import org.valkyrienskies.mod.common.ships.block_relocation.DetectorManager;

@ParametersAreNonnullByDefault
public class BlockPhysicsInfuserCreative extends BlockPhysicsInfuser {

    public BlockPhysicsInfuserCreative() {
        super("physics_infuser_creative");
        shipSpawnDetectorID = DetectorManager.DetectorIDs.BlockPosFinder.ordinal();
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip,
        ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.BLUE + I18n.format("tooltip.vs_control.physics_infuser_creative_1"));
        tooltip.add(TextFormatting.RED + "" + TextFormatting.ITALIC + I18n.format("tooltip.vs_control.physics_infuser_creative_2"));
    }

}