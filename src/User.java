import java.util.*;

/**
 * Created by IBAH on 01.07.15.
 */
public class User {

    static double nacenka = 1.5;
    static Set<User> userW = new TreeSet<>();
    static ArrayList<Produkt> goodsUs = new ArrayList<>();

    String userName;
    String userPhone;
    String userMail;
    String password;

    public User(String userName, String userPhone, String userMail, String password) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.userMail = userMail;
        this.password = password;
    }

    public ArrayList<Produkt> getGoodsUs() {

        for (Produkt tmp : Sklad.goods) {

            tmp.chena *= nacenka;
            goodsUs.add(tmp);


        }

        return goodsUs;

    }

    @Override
    public String toString() {
        return "User{" +
                "��� ������������  " + userName + '\'' +
                "������� ������������" + userPhone + '\'' +
                "����������� ����� ������������" + userMail + '\'' +
                "������" + password + '\'' +
                '}';
    }

    public void addUser(User user) {
        for (User temp : userW) {
            if (temp.userName.equals(user.userName) && temp.userMail.equals(user.userMail)) {
                System.out.println("������������ " + temp.userName + " � ���������� ������ - " + temp.userMail + " ��� ���������� ");
                System.out.println();
            }
        }
        userW.add(user);

    }

    public void reportUser(String userName, String pass) {
        if (userName.equals("Admin") && pass == "5555") {
            System.out.println("��� ������������ � ���� ������");
            {
                for (User temp : userW) {
                    System.out.println(temp);
                }
            }
        } else System.out.println("\n" + "��� �������� ������ ������������� ������� ���������� ��� � ������" + "\n");


    }

    public void reportUserPass(String userName, String password) {
        for (User temp : userW) {
            if (temp.userName.equals(userName) && temp.password.equals(password)) {
                System.out.println("��� ����� � ������");
                System.out.println(temp);
            }
        }
    }


    public Collection<Produkt> searchName(String name, Collection<Produkt> searchNam) {
        Vector<Produkt> sName = new Vector<>();
        for (Produkt tmp : searchNam) {
            if (tmp.name.equals(name))
                sName.add(tmp);
        }
        if (sName.isEmpty()) {
            System.out.println("�������� ������������ ������. ������� ���� �����.");
            searchNam.addAll(searchNam);
        }

        return sName;
    }

    public Collection<Produkt> searchCategory(Categoria categoria, Collection<Produkt> searchCat) {
        Vector<Produkt> sCategory = new Vector<>();
        for (Produkt tmp : searchCat) {
            if (tmp.categoria.equals(categoria))
                sCategory.add(tmp);
        }
        return sCategory;
    }

  }
