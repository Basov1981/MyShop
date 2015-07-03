import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;




public class Order {

    static ArrayList<Order> userBasket = new ArrayList<>();
    User user;
    Date datePurchases;
    String name;
    Proizvoditel proizvoditel;
    Tara tara;
    int price;
    int salesitem;
    int sum;

    public Order(User user, Date datePurchases, String name, Proizvoditel proizvoditel, Tara tara, int price, int salesitem, int sum) {
        this.user = user;
        this.datePurchases = datePurchases;
        this.name = name;
        this.proizvoditel = proizvoditel;
        this.tara = tara;
        this.price = price;
        this.salesitem = salesitem;
        this.sum = sum;
    }

    public ArrayList<Order> addToBasket(Order order) {
        if (userBasket.add(order)) {
            for (Produkt tmt : Sklad.goods) {
                if (tmt.name.equals(this.name) && tmt.tara.equals(this.tara)) {
                    if (tmt.kolichestvo >= salesitem)
                        tmt.kolichestvo -= salesitem;
                    else {
                        System.out.println("Не хватает товара " + this.name + " " + this.tara + " для пользователя " + this.user.userName);
                    }
                }
            }
        }
        sum = price * salesitem;
        return userBasket;
    }

    public ArrayList<Order> delItemsinBasket(Order order) {
        if (userBasket.remove(order)) {
            for (Produkt tmp : Sklad.goods) {
                if (tmp.name.equals(this.name) && tmp.tara.equals(this.tara)) {
                    tmp.kolichestvo += salesitem;
                }
            }
        }
        sum = price * salesitem;
        System.out.println(userBasket);
        return userBasket;
    }

//    public Collection<Order> searchUser() {
//        Vector<Order> sUse = new Vector<>();
//        for (Order tmp : searchUser) {
//            if (this.user.userName.equals(tmp.user.userName))
//                sUse.add(tmp);
//        }
//        return sUse;
//    }


    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", datePurchases=" + datePurchases +
                ", name='" + name + '\'' +
                ", proizvoditel=" + proizvoditel +
                ", tara=" + tara +
                ", price=" + price +
                ", salesitem=" + salesitem +
                ", sum=" + sum +
                '}';
    }
}
