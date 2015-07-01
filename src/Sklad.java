import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 * Created by IBAH on 30.06.15.
 */
public class Sklad {

    static Set<Produkt> goods = new TreeSet<Produkt>();
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
        return "Склад" +
                " Наименование -" + name + '\'' +
                " Площадь - " + square +
                " Адресс - '" + adress + '\'' +
                " Начальник склада - " + nachalnik + '\'' +
                '}';
    }

    public boolean addProdukt(Produkt produkt) {
        return goods.add(produkt);
    }

    public boolean addSklad(Sklad sklad) {
        return sklads.add(sklad);
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

    public void showScladProizvoditel(Proizvoditel proizvoditel) {
        int sum = 0;
        for (Produkt tmp : goods) {
            if (proizvoditel == tmp.proisvoditel) {
                sum += tmp.chena * tmp.kolichestvo;
                System.out.println("На складе товара - " + tmp.name + " от производителя - " + proizvoditel + " на сумму - " + sum + " грн.");

            }

        }

    }

    public void reportSkladCategory(Categoria categoria) {
        System.out.println("На " + name + " находится товар " + categoria + " в таком ассортименте");
        goods.stream().filter(temp -> categoria == temp.categoria).forEach(temp ->
                System.out.println(" " + temp.name + " " + temp.tara + "  " + temp.kolichestvo + " на сумму -  " + (temp.kolichestvo * temp.chena) + " грн."));
        System.out.println();
    }

    public void reportSkladProdukt(String name) {
        goods.stream().filter(temp -> temp.name.equals(name)).forEach(temp ->
                System.out.println(" " + temp.name + " " + temp.tara + "  " + temp.kolichestvo + " на сумму -  " + (temp.kolichestvo * temp.chena) + " грн.  Кладовщик " + nachalnik));
        System.out.println();
    }
}
