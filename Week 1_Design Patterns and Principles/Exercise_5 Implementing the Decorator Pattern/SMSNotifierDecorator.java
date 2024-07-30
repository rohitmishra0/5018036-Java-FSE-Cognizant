public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier decoratedNotifier) {
        super(decoratedNotifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send the email first
        sendSMS(message); // Then send the SMS
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}


