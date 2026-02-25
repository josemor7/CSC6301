/**
 * @author Jose Morales
 * Date: 02/10/2026
 * Description: Interface representing a notification medium for sending alerts.
 * @version 1.0
 */
public interface NotificationMedium {

    /**
     * Sends a notification message through this medium.
     * @param message the message to send
     */
    void send(String message);
}
