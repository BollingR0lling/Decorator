public abstract class Decorator implements Messages {

    private Messages messages;
    public Decorator(Messages messages) { this.messages = messages; }
}
