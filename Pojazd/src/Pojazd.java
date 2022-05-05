import lombok.*;

@Getter
@Setter
public class Pojazd {
    Integer rokProdukcji;
    String rodzajSilnika;
    String kolor;
    Integer masa;
    String RozmiarOpony;
    Integer iloscosob;

    public Pojazd(Integer rokProdukcji, String rodzajSilnika, String kolor, Integer masa, String RozmiarOpony, Integer iloscosob) {
        this.rokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.masa = masa;
        this.RozmiarOpony = RozmiarOpony;
        this.iloscosob = iloscosob;
    }

    public Pojazd() {

    }

    void uruchomSilnik() {
        System.out.println("Silnik uruchomiono");
    }

}

class Kolowe extends Pojazd {
    @Getter
    @Setter
    String rozmiarOpony;

    void uruchomSilnik() {
        System.out.println("Uruchomiono silnik " + rodzajSilnika);
    }
}

class Szynowe extends Pojazd {
    @Override
    void uruchomSilnik() {
        System.out.println("Uruchomiono silnik pojazdu szynowego");
    }
}

class Gasienicowe extends Pojazd {
    @Getter
    @Setter
    Integer moc;

    public Gasienicowe(Integer moc){
        this.moc = moc;
    }

    public Gasienicowe(){}

    final void uruchomSilnik() {
        super.uruchomSilnik();
        System.out.println("Jest to pojazd Gąsienicowy");
    }

}

class Ciezarowka extends Kolowe {
    @Getter
    @Setter
    Integer udzwig;

    public Ciezarowka(Integer udzwig){
        this.udzwig = udzwig;
    }

    public Ciezarowka(){}

}

class Osobowy extends Kolowe {
    @Getter
    @Setter
    Integer iloscOsob;

    public Osobowy(Integer iloscOsob){
        this.iloscOsob = iloscOsob;
    }

    public Osobowy(){}

}

class Pociag extends Szynowe {
    static String wlasciciel = "P.K.P";

    public Pociag(String wlasciciel){
    }

}

class Czolg extends Gasienicowe {
}

class Spychacz extends Gasienicowe {
}

@Getter
@Setter
class Sedan extends Osobowy {
    String model;
    String symbol;

    public Sedan(String model,String symbol){
        this.model = model;
        this.symbol = symbol;
    }

    public Sedan(){}

}

class Pickup extends Osobowy {
}

class Skoda extends Sedan {
}

class Volkswagen extends Sedan {
}

class SuperB extends Skoda {
}

class Octavia extends Skoda {
}
class Golf extends Volkswagen {
}
