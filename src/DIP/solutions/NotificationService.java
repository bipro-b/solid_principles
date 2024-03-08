package DIP.solutions;

public class NotificationService {
    Private MessageSender sender;

    public NotificationService(MessageSender sender){
        this.sender  = sender;
    }
    public void send(){
        sender.send();
    }

}
