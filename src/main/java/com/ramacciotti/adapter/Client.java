package com.ramacciotti.adapter;

import com.ramacciotti.adapter.adapters.HdmiToVgaAdapter;
import com.ramacciotti.adapter.devices.Computer;
import com.ramacciotti.adapter.devices.NewMonitor;
import com.ramacciotti.adapter.devices.OldMonitor;

public class Client {

    public static void main(String[] args) {

        System.out.println(" New Monitor ----------------------------------------------------");

        Computer computer = new Computer(); // This computer only accepts hdmi ports
        NewMonitor newMonitor = new NewMonitor(); // The newMonitor implements an Hdmi nterface,

        // ...So there is no problem connecting newMonitor to the computer
        computer.connectHdmi(newMonitor);
        computer.sendImageAndSound("Lazy Town villain", "We are number one song");

        System.out.println(" Old Monitor ----------------------------------------------------");

        Computer computer2 = new Computer();
        OldMonitor oldMonitor = new OldMonitor();
        // computer2.connectHdmi(oldMonitor); > this wouldnt work; oldmonitor doesnt implement Hdmi

        // Calling the adapter that is capable to convert a class (OldMonitor) that implements a vga interface
        // Now its possible to connect this old monitor to the computer
        computer2.connectHdmi(new HdmiToVgaAdapter(oldMonitor));
        computer.sendImageAndSound("Cat and rainbow", "Nyan cat song");

    }

}
