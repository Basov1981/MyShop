import java.util.Date;

enum Proizvoditel {
    Оболонь, Лакталис, Efes
}

enum Categoria {
    molochka, alkogol
}

enum Tara {
    Бутылка_0_5_л, Бутылка_0_33_л, Пакет_1_л, Пакет_0_5_л,
}


public class Produkt implements Comparable<Produkt> {

    String name;
    Proizvoditel proisvoditel;
    Categoria categoria;
    Date dateGreat;
    Tara tara;
    int chena;
    int srokGodnosti;
    int kolichestvo;

    public Produkt(String name, Proizvoditel proisvoditel, Categoria categoria, Date dateGreat, Tara tara, int srokGodnosti, int chena, int kolichestvo) {
        this.name = name;
        this.proisvoditel = proisvoditel;
        this.categoria = categoria;
        this.dateGreat = dateGreat;
        this.tara = tara;
        this.srokGodnosti = srokGodnosti;
        this.chena = chena;
        this.kolichestvo = kolichestvo;
    }


    public int compareTo(Produkt t) {
        int rez = this.name.compareTo(t.name) + (this.chena - t.chena) + this.tara.compareTo(t.tara) + (this.srokGodnosti - t.srokGodnosti);

        if (rez == 0) {
            t.kolichestvo = t.kolichestvo + this.kolichestvo;
        }
        return rez;
    }

    @Override
    public String toString() {
        return "\n" + "Продукт" +
                " название - " + name + '\'' +
                ", производитель - " + proisvoditel +
                ", категория - " + categoria +
                ", дата изготовления - " + dateGreat +
                ", тара -  " + tara +
                ", цена - " + chena +
                ", срок годности - " + srokGodnosti +
                ", количество - " + kolichestvo +
                '}';
    }

}


