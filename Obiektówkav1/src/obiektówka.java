

public class obiektówka {
    String imie;
    String nazwisko;
    String DataUrodzenia;
    String Miejscowosc;
    int liczby;
    float pojemnosc;

    obiektówka(String noweimie,String nowamiejscowosc){

    }





    public void Setnazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public String Getnazwisko(){
        return nazwisko;
    }

    public static void main(String []args){
        System.out.println("s");
    }
}

class obiektówka2 {

    String wiek;
    String nazwa;

    obiektówka noweimie = new obiektówka("Marek","Swidnica");
    obiektówka noweimie2 = new obiektówka("Kamil","Pszenno");


}

class obiektowka3{
    obiektówka2 nowywiek = new obiektówka2();
    obiektówka2 nowanazwa = new obiektówka2();
}
