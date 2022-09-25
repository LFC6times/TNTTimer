package ml.ikwid.tnttimer.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.TntEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Nameable;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(TntEntity.class)
public abstract class MixinTntEntity extends Entity implements Nameable {
    public MixinTntEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    @Shadow public abstract int getFuse();

    @Override
    public Text getName() {
        return this.getCustomName();
    }

    @Override
    public Text getCustomName() {
        String str = String.valueOf(this.getFuse() / 20f);
        if(str.length() < 4) {
            str += "0";
        }
        str += " s";
        return Text.of(str);
    }

    @Override
    public boolean isCustomNameVisible() {
        return true;
    }

    @Override
    public boolean shouldRenderName() {
        return true;
    }

    @Override
    public boolean hasCustomName() {
        return true;
    }
}
