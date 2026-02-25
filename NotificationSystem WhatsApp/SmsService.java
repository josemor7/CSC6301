/**
 * @author Jose Morales
 * Date: 02/10/2026
 * Description: The SmsService class implements the NotificationMedium interface and provides functionality to send notifications via SMS.
 * It simulates sending an SMS by printing the message to the console.
 * @version 1.0
 */
public class SmsService implements NotificationMedium {

    /**
     * Sends a notification message through SMS. This method simulates sending an SMS by printing the message to the console.
     * @param message the message to send via SMS
     */
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }

}
