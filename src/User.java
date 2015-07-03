import java.util.*;

/**
 * Created by IBAH on 01.07.15.
 */
public class User implements Comparable<User> {


    static Set<User> userW = new TreeSet<>();


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


    @Override
    public String toString() {
        return "\n" +"User{" +
                "Имя пользователя  "+ userName + '\'' +"Телефон пользователя  "+ userPhone + '\'' +"Електронная почта пользователя  "+ userMail + '\'' + "Пароль  "+ password + '\'' +
                '}';
    }

//    public void addUser(User user) {
//        for (User temp : userW) {
//            if (temp.userName.equals(user.userName) && temp.userMail.equals(user.userMail)) {
//                System.out.println("Пользователь " + temp.userName + " с электонной почтой - " + temp.userMail + " уже существует ");
//                System.out.println();
//            }
//        }
//        userW.add(user);
//
//    }
//
//    public void reportUser(String userName, String pass) {
//        if (userName.equals("Admin") && pass == "5555") {
//            System.out.println("Все пользователи в базе данных");
//            {
//                for (User temp : userW) {
//                    System.out.println(temp);
//                }
//            }
//        } else System.out.println("\n" + "Для посмотра списка пользователей введите правильное имя и пароль" + "\n");
//
//
//    }
//
//    public void reportUserPass(String userName, String password) {
//        for (User temp : userW) {
//            if (temp.userName.equals(userName) && temp.password.equals(password)) {
//                System.out.println("Ваш логин и пароль");
//                System.out.println(temp);
//            }
//        }
 //   }


    @Override
    public int compareTo(User o) {

        int rez = this.userName.compareTo(o.userName) + this.userPhone.compareTo(o.userPhone);

        return rez;
    }

    public boolean addUsers(User us){
        return userW.add(us);
    }

    public boolean deleteUser(User us1){
        return userW.remove(us1);
    }

    public void showUsers(){
        System.out.println(userW);
    }



}
