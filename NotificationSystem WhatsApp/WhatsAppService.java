/**
 * @author Jose Morales
 * Date: 02/17/2026
 * Description: The WhatsAppService class implements the NotificationMedium interface and provides functionality to send notifications via WhatsApp.
 * It simulates sending a WhatsApp message by printing the message to the console with a WhatsApp-specific format.
 * @version 1.0
 */
public class WhatsAppService implements NotificationMedium {
    /**
     * Sends a notification message via WhatsApp. This method simulates sending a WhatsApp message by printing the message to the console.
     * @param message the message to send via WhatsApp
     */
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
    
}
