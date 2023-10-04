import java.util.Objects;

public class ChatDevChecker {
    private static ChatDevChecker instance;
    private ChatDevChecker(){};

    public static ChatDevChecker getInstance(){
        if(instance == null){
            instance = new ChatDevChecker();
        }
        return instance;
    }
    private static String DEV_PASSWORD = "1234";
    public boolean checkPassword(String password){
        return Objects.equals(DEV_PASSWORD, password);
    }
}
