package Devices;

public class HomeTheater implements Devices {
    private boolean on = false;
    private int volume = 15;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void isOn() {
        on = true;
    }

    @Override
    public void isOff() {
        on = false;
    }

    @Override
    public int getVolumen() {
        return volume;
    }

    @Override
    public void setVolumen(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume <= 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void statusDevice() {
        System.out.println("\n");
        System.out.println(" Teatro en casa");
        System.out.println(" Estado: " + (on ? "Encendido" : "Apagado"));
        System.out.println(" Volumen actual: " + volume);
        System.out.println(" Canal actual: " + channel);
        System.out.println("Informacion terminada");

    }
}

