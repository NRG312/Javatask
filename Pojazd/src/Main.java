public class Main {

    public static void main(String[] args) {

        Golf golf1 = new Golf();
        golf1.setRokProdukcji(2019);
        golf1.setRodzajSilnika("elektryczny");
        golf1.setKolor("biały");
        golf1.setMasa(1200);
        golf1.setRozmiarOpony("195/70 R15");
        golf1.setIloscOsob(4);

        Golf golf2 = new Golf();
        golf2.setRokProdukcji(2012);
        golf2.setRodzajSilnika("benzynowy");
        golf2.setKolor("Czerwony");
        golf2.setMasa(1500);
        golf2.setRozmiarOpony("185/70 R16");
        golf2.setIloscOsob(5);

        Golf golf3 = new Golf();
        golf3.setRokProdukcji(2009);
        golf3.setRodzajSilnika("diesel");
        golf3.setKolor("Niebieski");
        golf3.setMasa(1800);
        golf3.setRozmiarOpony("195/80 R17");
        golf3.setIloscOsob(5);

        System.out.println(golf2.rodzajSilnika);
    }
}
