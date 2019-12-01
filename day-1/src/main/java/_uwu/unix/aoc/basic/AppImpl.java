package _uwu.unix.aoc.basic;

import _uwu.unix.aoc.api.App;
import _uwu.unix.aoc.api.module.Module;
import _uwu.unix.aoc.module.ModuleImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author ha6
 * @since 01.12.2019
 */

public class AppImpl implements App {

    private final Logger logger = Logger.getLogger("AppImpl");
    private final List<Module> moduleList = new ArrayList<>();

    @Override
    public void onLoad() throws IOException {
        Files.readAllLines(Paths.get("day1-data.txt"))
                .forEach(string -> this.moduleList.add(new ModuleImpl(Integer.parseInt(string))));

        this.logger.info(String.format("Part One: %d", this.partOne()));
        this.logger.info(String.format("Part Two: %d", this.partTwo()));
    }

    @Override
    public List<Module> getModuleList() {
        return this.moduleList;
    }

    private int partOne() {
        return moduleList
                .stream()
                .mapToInt(module -> module.getFuel().get(0))
                .sum();
    }

    private int partTwo() {
        return moduleList
                .stream()
                .mapToInt(module -> module.getFuel()
                        .stream()
                        .mapToInt(Integer::intValue)
                        .sum())
                .sum();
    }
}