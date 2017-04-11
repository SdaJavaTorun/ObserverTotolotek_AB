package com.sdajava.obserwerTotolotek;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrzej on 10.04.2017.
 */
public class Internet implements Obserwator, Media {


    private TotoLotek totolotek;
    private List<Integer> wyniki;

    public Internet(TotoLotek totolotek) {
        this.totolotek = totolotek;
        this.totolotek.dodajObserwatora(this);
    }


    @Override
    public void informuj() {
        System.out.println("::  Internet  ::  " + this.wyniki);
    }

    @Override
    public void update(List<Integer> wyniki) {
        this.wyniki = wyniki;
    }

    public void spadam () {}
}
