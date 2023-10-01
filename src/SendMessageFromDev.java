public class SendMessageFromDev implements ISendMessageBehavior{
    Chat chat = Chat.getInstance();
    String sticker = "\uD83D\uDCAF";
    @Override
    public void setMessage(String message, String user) {
        chat.addMessage(user + sticker + ":  " + message);
    }
    @Override
    public String getChat() {
        return chat.toString();
    }
}
