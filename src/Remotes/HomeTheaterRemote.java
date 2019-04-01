package Remotes;

import Devices.Devices;

public class HomeTheaterRemote extends TVRemote {
    protected Devices devices;


    public HomeTheaterRemote(Devices device){
        this.devices = device;
    }

    @Override
    public void power() {
        System.out.println("Boton power presionado");
        if(devices.isEnabled()){
            devices.isOff();
            System.out.println("Teatro en casa apagado");
        } else {
            devices.isOn();
            System.out.println("Teatro en casa encendido");
        }
    }

    @Override
    public void volumeUp() {
        System.out.println("Subiendo volumen");
        devices.setVolumen(devices.getVolumen() + 1);
    }

    @Override
    public void volumeDown() {
        System.out.println("Bajando volumen");
        devices.setVolumen(devices.getVolumen() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Siguiente");
        devices.setChannel(devices.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        System.out.println("Regresar");
        devices.setChannel(devices.getChannel() - 1);
    }
}
