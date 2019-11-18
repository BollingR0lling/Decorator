import java.util.PriorityQueue;

public class Client implements ChatClient {

    PriorityQueue<Message> messages = new PriorityQueue();

    @Override
    public Message getMessage() {
       return messages.poll();
    }

    @Override
    public void sendMessage(Message message) {
        messages.add(message);
    }
}

class Message {

    private String author;
    private String text;
    private String recivier;

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public String getRecivier() { return recivier; }
    public void setRecivier(String recivier) { this.recivier = recivier; }
}
