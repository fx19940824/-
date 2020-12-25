package 取款;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        Account account = new Account();
        account.setAmount(10000);

        Account account2 = new Account();
        account2.setAmount(10000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        String zh = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        account.setCardId(zh);
        account.setPassword(password);
        DrawThread thread01 = new DrawThread(account, 10000);
        thread01.setName("xiaoming");

        System.out.println("请输入账号：");
        String zh2 = scanner.next();
        System.out.println("请输入密码：");
        String password2 = scanner.next();
        account2.setCardId(zh2);
        account2.setPassword(password2);
        DrawThread thread02 = new DrawThread(account2, 1000);
        thread02.setName("xiaominglaopo");

        thread01.start();
        thread02.start();

    }
}
