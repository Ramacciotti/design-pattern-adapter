package com.ramacciotti.adapter.devices;

import com.ramacciotti.adapter.interfaces.Hdmi;

public class NewMonitor implements Hdmi {

    @Override
    public void setImage(String image) {
        System.out.println("** Video: " + image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("** Sound: " + sound);
    }

}
