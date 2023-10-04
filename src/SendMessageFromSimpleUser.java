public class SendMessageFromSimpleUser implements ISendMessageBehavior {
    Chat chat = Chat.getInstance();
    @Override
    public void setMessage(String message, String user) {
        chat.addMessage(user + ":  " + message);
    }
}
