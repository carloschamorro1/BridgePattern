package Remotes;

import Devices.Devices;

public class TVRemote implements Remote {
    protected Devices devices;

    public TVRemote(){

    }

    public TVRemote(Devices device){
        this.devices = device;
    }

    @Override
    public void power() {
        System.out.println("Boton power presionado");
        if(devices.isEnabled()){
            devices.isOff();
            System.out.println("Televisor apagado");
        } else {
            devices.isOn();
            System.out.println("Televisor encendido");
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
        System.out.println("Canal siguiente");
        devices.setChannel(devices.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        System.out.println("Canal anterior");
        devices.setChannel(devices.getChannel() - 1);
    }
}
