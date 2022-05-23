package com.poo;

public class Main {
    public static void main (String[] args) {
        SmartPhone onePlus = new SmartPhone(
                "OnePlus",
                "Nord 2T",
                "1080 x 2400 pixels",
                "Mediatek Dimensity 1300 3GHz",
                "8GB/12GB",
                "128GB/256GB",
                "4500 mAh",
                "Android 12",
                false,
                "Triple, 50MP+8MP+2MP");

        SmartWatch lg = new SmartWatch(
                "LG",
                "Watch W7",
                "360 x 360 pixels",
                "Snapdragon Wear 2100 1.1GHz",
                "768MB",
                "4GB",
                "240 mAh",
                "Wear OS 2.1",
                false,
                false);


        System.out.println(onePlus.brand + " " + onePlus.model);
        System.out.println(onePlus);

        System.out.println('\n');

        System.out.println(lg.brand + " " + lg.model);
        System.out.println(lg);
    }
}
