package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, int maxSize, int storageUsed) {
        super(name, maxSize, storageUsed);
    }
    // spin speed
    //Max size - 10GB

    @Override
    public void spinDisc() {
        System.out.println("This DVD spins FAST");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
