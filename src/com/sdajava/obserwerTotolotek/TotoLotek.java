package com.sdajava.obserwerTotolotek;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Andrzej on 10.04.2017.
 */
public class TotoLotek implements Obserwowany {

    private List<Obserwator> obserwatorzy = new ArrayList<>();
    private List<Integer> wyniki = new ArrayList<>();

    @Override
    public void dodajObserwatora(Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        obserwatorzy.remove(obserwator);
    }


    public  void Totolotek(){
        wyniki.clear();
        Random randomNumbers = new Random();
        for(int i = 0; i<=5; i++)
            wyniki.add(randomNumbers.nextInt(20));
   }

   public void kolejneLosowanie(){
       wyniki.clear();
       Random randomNumbers = new Random();
       for(int i = 0; i<=5; i++)
           wyniki.add(randomNumbers.nextInt(20));
       powiadamiajObserwatorow();
   }

    @Override
    public void powiadamiajObserwatorow() {
        obserwatorzy.forEach(o -> o.update(getResult()));

    }


    public List<Integer> getResult() {
       return wyniki;

    }
}
