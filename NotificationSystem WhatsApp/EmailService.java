/**
 * @author Jose Morales
 * Date: 02/10/2026
 * Description: The EmailService class implements the NotificationMedium interface and provides functionality to send notifications via email.
 * It simulates sending an Email by printing the message to the console.
 * @version 1.0
 */
public class EmailService implements NotificationMedium {

    /**
     * Sends a notification message through email. This method simulates sending an email by printing the message to the console.
     * @param message the message to send via email
     */
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }

}
