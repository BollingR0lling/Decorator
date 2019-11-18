class TextEncryptDecorator extends Decorator {

    public TextEncryptDecorator(Messages messages) { super(messages); }


    public void getMessage() {

    }

    public void sendMessage(Message message) {
        System.out.println(message.getAuthor());
        System.out.println("Данное сообщение зашифровано -> " + message.getText());
        System.out.println(message.getRecivier());
    }
}
