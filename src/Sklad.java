import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


public class Sklad {

    static Set<Produkt> goods = new TreeSet<>();
    Vector<Sklad> sklads = new Vector<>();


    String name;
    int square;
    String adress;
    String nachalnik;

    public Sklad(String name, int square, String adress, String nachalnik) {
        this.name = name;
        this.square = square;
        this.adress = adress;
        this.nachalnik = nachalnik;
    }

    @Override
    public String toString() {
        return "\n" + "Склад" +
                " Наименование -" + name + '\'' +
                " Площадь - " + square +
                " Адресс - '" + adress + '\'' +
                " Начальник склада - " + nachalnik + '\'' +
                '}';
    }

    public boolean addSklad(Sklad sklad) {

        return sklads.add(sklad);
    }

    public boolean addProdukt(Produkt produkt) {

        return goods.add(produkt);

    }

    public boolean deleteProdukt(Produkt produkt) {

        return goods.remove(produkt);
    }

    public void showSklad() {

        System.out.println(sklads + "\n");
    }

    public void showGoods() {

        System.out.println(goods + "\n");
    }

}
