package ChatApp.src.Model;

public class Message {
    public String sender;
    public String receiver;
    public String content;
    public String type;

    public Message(String sender, String receiver, String content, String type) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.type = type;
    }
}
