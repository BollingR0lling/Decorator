public class Client implements Messages {

    Message message = new Message();

    public Client(Message message){
        this.message = message;
    }

    @Override
    public void getMessage() {

    }

    @Override
    public void sendMessage(Message message) {
        System.out.println(message.getAuthor());
        System.out.println(message.getText());
        System.out.println(message.getRecivier());
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
