package org.launchcode.studio7;

public abstract class BaseDisc {
    //fields
    //name, capacity, contents, disc type

    private String name;
    private int maxSize;
    private int storageUsed;

    public BaseDisc(String name, int maxSize, int storageUsed) {
        this.name = name;
        this.maxSize = maxSize;
        this.storageUsed = storageUsed;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(int storageUsed) {
        this.storageUsed = storageUsed;
    }

    //methods
    //write data
    //read data
    //pause
    //play
}
