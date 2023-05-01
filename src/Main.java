public class Main {
    public static void main(String[] args) {

        int customerAccount = 100;
        int accountUpload = 1100;
        int bonusSize = 100;

//        int bonus;
//        if (accountUpload >= 1000) {
//            bonus = accountUpload / bonusSize;
//        } else {
//            bonus = 0;
//        }
        int bonus = accountUpload >= 1000 ? accountUpload / bonusSize : 0;

        int balansFull = customerAccount + accountUpload + bonus;

        System.out.println("Вы пополнили счет на: " + accountUpload + " руб.");
        System.out.println("Ваш бонус составил: " + bonus + " руб.");
        System.out.println("Ваш баланс: " + balansFull + " руб.");

    }
}