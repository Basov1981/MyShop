import java.util.Collections;
import java.util.Date;

/**
 * Created by IBAH on 30.06.15.
 */
public class Main {

    public static void main(String[] args) {


        Sklad skladik = new Sklad("Главный склад", 250, "Фрунзе 13", "Кокодзий");
        Sklad skladBeer = new Sklad("Алкоголь", 120, "Адммрала Макарова 40", "Рублёв");
        Sklad skladMilk = new Sklad("Молочная продукция", 150, "Адммрала Макарова 42", "Клыгин");


        skladik.addSklad(skladBeer);
        skladik.addSklad(skladMilk);
        skladik.addSklad(skladik);

        skladik.showSklad();// показать все склады;

        Produkt beer = new Produkt("Десант", Proizvoditel.Оболонь, Categoria.alkogol, new Date(), Tara.Бутылка_0_5_л, 12, 14, 70);
        Produkt beer1 = new Produkt("Десант", Proizvoditel.Оболонь, Categoria.alkogol, new Date(), Tara.Бутылка_0_33_л, 10, 14, 100);
        Produkt beer2 = new Produkt("Венское", Proizvoditel.Оболонь, Categoria.alkogol, new Date(), Tara.Бутылка_0_5_л, 15, 12, 80);
        Produkt beer3 = new Produkt("Венское", Proizvoditel.Оболонь, Categoria.alkogol, new Date(), Tara.Бутылка_0_33_л, 12, 12, 90);
        Produkt molochka = new Produkt("Президент", Proizvoditel.Лакталис, Categoria.molochka, new Date(), Tara.Пакет_1_л, 9, 3, 50);
        Produkt molochka1 = new Produkt("Президент", Proizvoditel.Лакталис, Categoria.molochka, new Date(), Tara.Пакет_0_5_л, 7, 3, 60);
        Produkt molochka2 = new Produkt("Дольче йогурт", Proizvoditel.Лакталис, Categoria.molochka, new Date(), Tara.Пакет_1_л, 18, 4, 50);
        Produkt molochka3 = new Produkt("Дольче йогурт", Proizvoditel.Лакталис, Categoria.molochka, new Date(), Tara.Пакет_1_л, 12, 4, 50);

        skladik.addProdukt(beer);
        skladik.addProdukt(beer1);
        skladik.addProdukt(beer2);
        skladik.addProdukt(beer3);
        skladik.addProdukt(molochka);
        skladik.addProdukt(molochka1);
        skladik.addProdukt(molochka2);
        skladik.addProdukt(molochka3);


        skladik.showGoods();


        User users1 = new User("Иванов", "0635476486", "ergs@mail.ru", "ertretgd");
        User users13 = new User("Иванов", "0635476486", "fgjh@mail.ru", "ertretgd");
        User users2 = new User("Петров", "0935476486", "gfhgccf@mail.ru", "ertrrtetgd");
        User users3 = new User("Сидоров", "06354576486", "awerf@mail.ruд", "ererttretgd");
        User users4 = new User("Рублевцев", "06355676486", "ukilf@mail.ru", "erterterretgd");// этот пользователь не добавляется????
        User users5 = new User("Латыпов", "06355676486", "ukilf@mail.ru", "erterterretgd");


        users1.addUsers(users1);
        users1.addUsers(users13);
        users1.addUsers(users2);
        users1.addUsers(users3);
        users1.addUsers(users4);
        users1.addUsers(users5);

        users1.showUsers();

        users1.deleteUser(users3);// пользователь Сидоров не удаляется????

        Order orderUs = new Order(users1, new Date(),"Десант", Proizvoditel.Оболонь,Tara.Бутылка_0_5_л,15, 5 , 50);
        Order orderUs1 = new Order(users1, new Date(),"Десант", Proizvoditel.Оболонь,Tara.Бутылка_0_5_л,15, 5 , 50);
        Order orderUs2 = new Order(users1, new Date(),"Десант", Proizvoditel.Оболонь,Tara.Бутылка_0_5_л,15, 5 , 50);
        Order orderUs3 = new Order(users1, new Date(),"Десант", Proizvoditel.Оболонь,Tara.Бутылка_0_5_л,15, 5 , 50);




    }


}
