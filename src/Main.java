import Devices.*;
import Remotes.*;

public class Main {

    public static void main(String[] args) {
       testTV(new TV());
       testHomeTheater(new HomeTheater());
    }

    public static void testTV(Devices device) {
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("Prueba con televisor.");
        TVRemote tvRemote = new TVRemote(device);
        tvRemote.power();
        tvRemote.channelUp();
        tvRemote.volumeUp();
        device.statusDevice();
        System.out.println("----------------------------------------");
    }

    public static void testHomeTheater(Devices device) {
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("Prueba con teatro en casa.");
        HomeTheaterRemote homeTheaterRemote = new HomeTheaterRemote(device);
        homeTheaterRemote.power();
        device.statusDevice();
        System.out.println("----------------------------------------");
    }
}