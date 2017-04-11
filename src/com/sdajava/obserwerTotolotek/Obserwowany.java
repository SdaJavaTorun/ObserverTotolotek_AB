package com.sdajava.obserwerTotolotek;

/**
 * Created by Andrzej on 10.04.2017.
 */
public interface Obserwowany {

    public void dodajObserwatora(Obserwator obserwator);
    public void usunObserwatora(Obserwator obserwator);
    public void powiadamiajObserwatorow();
}
