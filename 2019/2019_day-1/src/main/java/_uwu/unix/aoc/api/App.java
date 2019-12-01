package _uwu.unix.aoc.api;


import _uwu.unix.aoc.api.module.Module;

import java.io.IOException;
import java.util.List;

/**
 * @author ha6
 * @since 01.12.2019
 */

public interface App {

    void onLoad() throws IOException;

    List<Module> getModuleList();

}