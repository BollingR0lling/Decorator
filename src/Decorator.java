public abstract class Decorator implements ChatClient {

    private ChatClient decoratee;
    public Decorator(ChatClient chatClient) { decoratee = chatClient; }

    @Override
    public Message getMessage() {
        return decoratee.getMessage();
    }

    @Override
    public void sendMessage(Message message) {
        decoratee.sendMessage(message);
    }
}
