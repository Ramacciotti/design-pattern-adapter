package com.ramacciotti.adapter.adapters;

import com.ramacciotti.adapter.interfaces.Hdmi;
import com.ramacciotti.adapter.interfaces.Vga;

public class HdmiToVgaAdapter implements Hdmi {

    private final Vga vga;

    public HdmiToVgaAdapter(Vga vga) {
        System.out.println("Connecting to Hdmi/Vga adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting image from HDMI to VGA...");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sound is not acceptable.");
    }

}
