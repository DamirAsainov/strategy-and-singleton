public class User{
    private String username;

    private ISendMessageBehavior sendMessageBehavior;

    public User(){
        sendMessageBehavior = new SendMessageFromGuest();
    };
    public User(String username){
        this.username = username;
        sendMessageBehavior = new SendMessageFromSimpleUser();
    }
    public User(String username, String password){
        this.username = username;
        if(Chat.getInstance().checkPassword(password)){
            sendMessageBehavior = new SendMessageFromDev();
        }
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void sendMessage(String s){
        sendMessageBehavior.setMessage(s,username);
    }

}
