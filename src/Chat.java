import java.util.Objects;

public class Chat {
    private static Chat instance;
    private String chat = "Chat history";

    private Chat(){};

    public static Chat getInstance(){
        if(instance == null){
            instance = new Chat();
        }
        return instance;
    }
    public String getChat(){
        return chat;
    }
    public void addMessage(String message){
        chat = chat + "\n" + message;
    }
}
