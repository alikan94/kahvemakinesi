package kahveMakinesi;

import java.util.ArrayList;
import java.util.List;

public class KahveSecim {
    static List<Kahve> kahveEkranListi = new ArrayList<>();

    public static void kahveListesiniOlustur(){
        Kahve kahve1 = new Kahve("1", "Türk Kahvesi");
        Kahve kahve2 = new Kahve("2", "Filtre Kahve");
        Kahve kahve3 = new Kahve("3", "Espresso");
        Kahve kahve4 = new Kahve("4", "Americano");


    }

    public static void kahveListesiniYazdir(){

    }

}
