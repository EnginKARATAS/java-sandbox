class MesailiCalısan extends Calisan IMesaisiz{
    int MesaiUcreti();
    int NormalUcret();
}

class MsaisizCalisan extends Calisan implements IMesaisiz,IMesaili{
    int MesaiUcreti(){
        return null
    }
    int NormalUcret();
}

class Calisan{
    int id;
    String name;
}

public interface IMesaisiz{
    int normalUcreti();
}

public interface IMesaili{
    int MesaiUcreti();

}