package com.mariokart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarioKartCompareApp {
    public static void main(String[] args) {
        List<JetKart> karts = new ArrayList<JetKart>();

        //create and add the kart at the same time to the karts list
        karts.add( new JetKart("Blue Falcon", 2000, 8) );
        karts.add( new JetKart("Blue Falcon", 1500, 7) );
//        karts.add( new StandardKart("Pipe Dream", 750, 8) );
//        karts.add( new JetKart("Cloud Jumper", 700, 10) );

        //loop over before sorting
        for(JetKart currentKart : karts){
            System.out.println(currentKart.getName() + " - " + currentKart.getBasePrice() + " - " + currentKart.getTurboLevel());
        }

        //we have a list of complex things and we need to sort them but we dont know how they should
        //be sorted
        Collections.sort(karts);

        System.out.println("===============list separator==================");

        for(JetKart currentKart : karts){
            System.out.println(currentKart.getName() + " - " + currentKart.getBasePrice() + " - " + currentKart.getTurboLevel());
        }
    }

}
