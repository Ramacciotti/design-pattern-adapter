package com.ramacciotti.adapter.devices;

import com.ramacciotti.adapter.interfaces.Hdmi;

public class Computer {

    private Hdmi hdmi;

    public void connectHdmi(Hdmi hdmi) {

        System.out.println("Connecting on HDMI port...");
        this.hdmi = hdmi;

    }

    public void sendImageAndSound(String image, String sound) {

        if (hdmi == null) {

            System.out.println("Connect a HDMI cable first");

        } else {

            hdmi.setImage(image);
            hdmi.setSound(sound);

        }
    }

}
