package com.ramacciotti.adapter.devices;

import com.ramacciotti.adapter.interfaces.Vga;

public class OldMonitor implements Vga {

    @Override
    public void setImage(String image) {
        System.out.println("** Video: " + image);
    }

}
