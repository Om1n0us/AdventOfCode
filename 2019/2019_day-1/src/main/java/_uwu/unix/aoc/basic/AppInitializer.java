package _uwu.unix.aoc.basic;

import java.io.IOException;

/**
 * @author ha6
 * @since 01.12.2019
 */

public class AppInitializer {
    public static void main(String... args) throws IOException {
        new AppImpl().onLoad();
    }
}