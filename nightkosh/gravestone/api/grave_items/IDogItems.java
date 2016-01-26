package nightkosh.gravestone.api.grave_items;

import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

import java.util.List;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IDogItems {

    public List<ItemStack> addItems(EntityWolf dog, DamageSource source);
}
