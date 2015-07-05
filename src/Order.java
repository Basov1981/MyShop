import java.util.*;


public class Order implements  Comparable<Order>{
    private Set<Order> musor= new TreeSet<>();
    int numberOrd;
    int statusOrd;
    Date dateCreate;
    private Map < Produkt, Integer> korzina = new TreeMap<>();

    private static int maxNumber ;

    public Order() {
        this.numberOrd=maxNumber+1;
        this.dateCreate=new Date();
        musor.add(this);

    }

    public static void main(String[] args) {
        Order ord= new Order();
        Produkt beer = new Produkt("Десант", Proizvoditel.Оболонь, Categoria.alkogol, new Date(), Tara.Бутылка_0_5_л, 12, 14, 70);
        Produkt beer1 = new Produkt("Десант", Proizvoditel.Оболонь, Categoria.alkogol, new Date(), Tara.Бутылка_0_33_л, 10, 14, 100);
        Produkt beer2 = new Produkt("Венское", Proizvoditel.Оболонь, Categoria.alkogol, new Date(), Tara.Бутылка_0_5_л, 15, 12, 80);
        ord.addIten(beer,1);
        ord.addIten(beer,2);
        System.out.println(ord.toString());
    }

    public void addIten(Produkt pr, int countProd ){

        if(  korzina.containsKey(pr)){
            int newCount =  korzina.get(pr)+ countProd;
            korzina.put(pr, newCount);
        }
        else {
            korzina.put(pr, countProd);
            System.out.println(korzina);
        }
        pr.kolichestvo=pr.kolichestvo-countProd;
    }

    @Override
    public int compareTo(Order or) {

        return  this.numberOrd - or.numberOrd;
    }

    @Override
    public String toString() {
        String result="";
        Set<Map.Entry<Produkt,Integer>> temp= korzina.entrySet();
        for(Map.Entry<Produkt,Integer> qwe:temp){
            result=result+"Товар "+qwe.getKey().name+ " количество -"+qwe.getValue()+" zak "+this.numberOrd+ "\n";
        }

        return result;
    }


}
