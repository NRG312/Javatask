public class MojaKlasa implements PierwszyInterfejs, DrugiInterfejs{

    public void f() {
        PierwszyInterfejs.super.f();
        DrugiInterfejs.super.f();
    }


}


