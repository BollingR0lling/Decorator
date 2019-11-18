import java.util.Base64;

class UserEncryptDecorator extends Decorator {

    public UserEncryptDecorator(ChatClient chatClient) { super(chatClient); }

    @Override
    public Message getMessage() {
        return encodeUser(super.getMessage());
    }

    public Message encodeUser(Message message){
        message.setAuthor(encode(message.getAuthor()));
        return message;
    }

    public String encode(String author){
        byte[] result = author.getBytes();
        for(int i=0 ; i<result.length ; i++){
            result[i] += (byte)1;
        }
        return Base64.getEncoder().encodeToString(result);
    }
//    public String decode(String author){
//        byte[] result = Base64.getDecoder().decode(author);
//        for(int i=0 ; i<result.length ; i++){
//            result[i] -= (byte)-1;
//        }
//        return new String(result);
//    }
}
