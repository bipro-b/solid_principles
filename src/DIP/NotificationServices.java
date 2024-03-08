package DIP;

public class NotificationServices {
     public EmailSender emailSender;
     public SMSSender smsSender;
    public PushNotificationSender pushSender;


    public NotificationServices() {
        emailSender = new EmailSender();
        smsSender = new SMSSender();
        pushSender = new PushNotificationSender();
    }

    public void sendEmail() {
        emailSender.send();
    }

    public void sendSMS() {
        smsSender.send();
    }

    public void sendPushNotification() {
        pushSender.send();
    }
}
