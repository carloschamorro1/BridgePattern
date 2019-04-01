package Devices;

public interface Devices {
    boolean isEnabled();

    void isOn();

    void isOff();

    int getVolumen();

    void setVolumen(int n);

    int getChannel();

    void setChannel(int n);

    void statusDevice();

}
