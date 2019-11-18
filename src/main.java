public class main {
    public static void main(String []args){
        Client client = new Client();
        Message message = new Message();
        message.setAuthor("Владимир");
        message.setText("Данное сообщение тестовое");
        message.setRecivier("Валерий");

        //Обычное сообщение
        client.sendMessage(message);
        client.getMessage();
        //Декоратор возвращающий сообщение с закодированным сообщением
        Decorator textEncrytp = new TextEncryptDecorator(client);
        textEncrytp.sendMessage(message);
        textEncrytp.getMessage();
        //Декоратор возвращающий сообщение с закодированным именем и сообщением
        Decorator textAndUserEncrypt = new TextEncryptDecorator(new UserEncryptDecorator(client));
        textAndUserEncrypt.sendMessage(message);
        textAndUserEncrypt.getMessage();
    }
}
