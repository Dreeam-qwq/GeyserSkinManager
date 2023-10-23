package com.github.camotoy.geyserskinmanager.common;

public class RawCape {
    public final int width;
    public final int height;
    public final String id;
    public final byte[] data;

    public RawCape(int width, int height, String id, byte[] data) {
        this.width = width;
        this.height = height;
        this.id = id;
        this.data = data;
    }
}
