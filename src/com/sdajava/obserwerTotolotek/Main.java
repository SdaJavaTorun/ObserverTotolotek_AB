package com.sdajava.obserwerTotolotek;

public class Main {

    public static void main(String[] args) {

        TotoLotek totoLotek = new TotoLotek();

        Telewizja telewizja = new Telewizja(totoLotek);
        Internet internet = new Internet(totoLotek);

      //  totoLotek.dodajObserwatora(telewizja);
      //  totoLotek.dodajObserwatora(internet);

        totoLotek.Totolotek();
        totoLotek.powiadamiajObserwatorow();
        telewizja.informuj();
        internet.informuj();

        totoLotek.kolejneLosowanie();
        totoLotek.powiadamiajObserwatorow();
        telewizja.informuj();
        internet.informuj();

        totoLotek.usunObserwatora(telewizja);

        totoLotek.kolejneLosowanie();
        totoLotek.powiadamiajObserwatorow();
        telewizja.informuj();
        internet.informuj();

    }
}
