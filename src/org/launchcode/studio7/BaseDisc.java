package org.launchcode.studio7;

import java.util.List;

public abstract class BaseDisc {

    private double storageCapacity;

    private String discType;

    private double discSpeed;

    private List contents;

    public BaseDisc(double storageCapacity, String discType, double diskSpeed, List contents) {
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.discSpeed = diskSpeed;
        this.contents = contents;
    }
}
