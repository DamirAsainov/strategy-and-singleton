import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Dos1k04");
        User user2 = new User();
        User user3 = new User();
        User user4 = new User("Damir Asainov", "1234");
        user.sendMessage("Hello )");
        user2.sendMessage("Hi");
        user3.sendMessage("Salem");
        user4.sendMessage("Thank, you for using my app");

        Chat chat = Chat.getInstance();
        System.out.println(chat.getChat());
    }
}