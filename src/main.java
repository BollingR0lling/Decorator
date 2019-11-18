public class main {
    public static void main(String []args){
        Message message = new Message();
        message.setAuthor("Алексей");
        message.setRecivier("Владимир");
        message.setText("Данное сообщение является тестовым");
        Client client = new Client(message);

        System.out.println("Обычное сообщение");
        client.sendMessage(message);

        System.out.println("------------------");
        System.out.println("Сообщение с зашифрованным именем");
        Messages userEncrypt = new UserEncryptDecorator(client);
        userEncrypt.sendMessage(message);


        System.out.println("------------------");
        System.out.println("Сообщение с зашифрованным именем и текстом");
        Messages userAndTextEncrypt = new UserEncryptDecorator(new TextEncryptDecorator (client));
        userAndTextEncrypt.sendMessage(message);
    }
}
