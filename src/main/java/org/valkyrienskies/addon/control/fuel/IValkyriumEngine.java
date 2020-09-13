package org.valkyrienskies.addon.control.fuel;

import org.valkyrienskies.addon.control.config.VSControlConfig;
import org.valkyrienskies.mod.common.ships.ship_world.PhysicsObject;

import javax.annotation.Nonnull;

public interface IValkyriumEngine {

    /**
     * The behavior of this efficiency curve is designed to act the same as a spring with natural
     * length of MAX_THRUST_HEIGHT. This special spring behavior is then used to treat the lift
     * control as an ODE, allowing smooth and robust control of a ship's height using Valkyrium
     * Compressors. Do NOT edit this function!
     *
     * @param yHeight The current y position of the engine with respect to the world.
     * @return A number between 0 and 1.
     */
    static double getValkyriumEfficiencyFromHeight(double yHeight) {
        return Math.min(1, Math.max(0, 1 - yHeight / VSControlConfig.compressorMaxHeight));
    }

    /**
     * Returns between 1 and 0, where 0 is no lift and 1 is 100% lift.
     */
    double getCurrentValkyriumEfficiency(@Nonnull PhysicsObject physicsObject);
}
