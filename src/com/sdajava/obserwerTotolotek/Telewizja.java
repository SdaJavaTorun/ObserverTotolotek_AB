package com.sdajava.obserwerTotolotek;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrzej on 10.04.2017.
 */
public class Telewizja implements Obserwator, Media {


    private TotoLotek totolotek;
    private List<Integer> wyniki;

    public Telewizja (TotoLotek totolotek){
        this.totolotek = totolotek;
        this.totolotek.dodajObserwatora(this);
    }


    @Override
    public void informuj() {
        System.out.println("::  Telewizja  ::  " + this.wyniki);
    }

    @Override
    public void update(List<Integer> wyniki) {
        this.wyniki = wyniki;
    }

    public void spadam () {
    }
}
