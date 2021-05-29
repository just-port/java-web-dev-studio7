package org.launchcode.studio7;

import java.util.List;

public class CD extends BaseDisc implements OpticalDisc {


    public CD(double storageCapacity, String discType, double diskSpeed, List contents) {
        super(storageCapacity, discType, diskSpeed, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("This disc spins at " + discSpeed);
    }

    @Override
    public String readData() {
        return null;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
