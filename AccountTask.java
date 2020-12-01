/*Создать класс Account с внутренним классом, с помощью объектов
которого можно хранить информацию обо всех операциях со счетом (снятие, платежи, поступления).*/

public class AccountTask {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.withdrawal);
        System.out.println(account.payment);
        System.out.println(account.receipt);
    }
}
