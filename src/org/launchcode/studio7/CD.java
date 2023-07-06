package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String name, int maxSize, int storageUsed) {
        super(name, maxSize, storageUsed);
    }
    //skip song
    //spin speed
    // max size (700MB)

    @Override
    public void spinDisc() {
        System.out.println("This CD spins SLOW");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
