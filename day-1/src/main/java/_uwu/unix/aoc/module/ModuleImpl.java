package _uwu.unix.aoc.module;

import _uwu.unix.aoc.api.module.Module;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ha6
 * @since 01.12.2019
 */

public class ModuleImpl implements Module  {

    private final List<Integer> fuel = new ArrayList<>();

    public ModuleImpl(int moduleMass) {
        this.fuel.add(this.calculateRequiredFuel(moduleMass));

        while (this.calculateRequiredFuel(fuel.get(fuel.size() - 1)) != 0)
            fuel.add(this.calculateRequiredFuel(fuel.get(fuel.size() - 1)));
    }

    @Override
    public List<Integer> getFuel() {
        return this.fuel;
    }

    private int calculateRequiredFuel(int input) {
        return Math.max(input / 3 - 2, 0);
    }
}