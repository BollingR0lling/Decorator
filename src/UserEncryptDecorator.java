import java.util.Base64;

class UserEncryptDecorator extends Decorator {

    public UserEncryptDecorator(Messages messages) { super(messages); }

    public void getMessage() {

    }

    public void sendMessage(Message message) {
        System.out.println(encode(message.getAuthor()));
        System.out.println(message.getText());
        System.out.println(message.getRecivier());
    }

    public String encode(String author){
        byte[] result = author.getBytes();
        for(int i=0 ; i<result.length ; i++){
            result[i] += (byte)1;
        }
        return Base64.getEncoder().encodeToString(result);
    }
    public String decode(String author){
        byte[] result = Base64.getDecoder().decode(author);
        for(int i=0 ; i<result.length ; i++){
            result[i] -= (byte)-1;
        }
        return new String(result);
    }

}
