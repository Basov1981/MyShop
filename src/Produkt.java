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


public class Produkt {

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

        int rez = 0;
        boolean flag = !this.name.equals(t.name) ||
                !this.proisvoditel.equals(t.proisvoditel) ||
                t.chena != this.chena;
        if (flag) rez = 1;
        else {
            if (t.kolichestvo != kolichestvo) {
                for (int r = 0; r < 1; r++) {
                    int id;
                    id = (t.kolichestvo += kolichestvo);
                    kolichestvo = id;
                }
            } else {
                int id = kolichestvo;
                for (int r = 0; r < 1; r++) {
                    id += kolichestvo - t.kolichestvo;
                    kolichestvo = id;
                }
            }
        }
        return rez;
    }


    @Override
    public String toString() {
        return "Продукт" +
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


