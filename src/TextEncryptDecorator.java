class TextEncryptDecorator extends Decorator {

    public TextEncryptDecorator(ChatClient chatClient) { super(chatClient); }

    @Override
    public Message getMessage(){
        return decode(super.getMessage());
    }

    @Override
    public void sendMessage(Message message){
        encode(message);
        super.sendMessage(message);
    }

    public void encode(Message message){
        message.setText("Даннное сообщение закодировано -> " + message.getText());
    }

    public Message decode(Message message){
        if(message.getText().startsWith("Данное сообщение закодировано")){
            message.setText(message.getText().substring(0 , 32));
        }
        return message;
    }
}
