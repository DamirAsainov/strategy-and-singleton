public class SendMessageFromGuest implements ISendMessageBehavior {
    static int id = 0;
    int username;
    Chat chat = Chat.getInstance();
    @Override
    public void setMessage(String message, String user) {
        chat.addMessage("Guest" + username + ":  " + message);
    }
    public SendMessageFromGuest(){
        username = ++id;
    }
}
