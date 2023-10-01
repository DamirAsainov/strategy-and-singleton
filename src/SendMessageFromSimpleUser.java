public class SendMessageFromSimpleUser implements ISendMessageBehavior {
    Chat chat = Chat.getInstance();
    @Override
    public void setMessage(String message, String user) {
        chat.addMessage(user + ":  " + message);
    }

    @Override
    public String getChat() {
        return chat.toString();
    }
}
