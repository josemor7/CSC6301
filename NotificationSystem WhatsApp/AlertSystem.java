import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jose Morales
 * Date: 02/10/2026
 * Description: The AlertSystem class is responsible for managing alerts and sending notifications to users through a specified notification medium. 
 * It allows users to set their preferred notification method and keeps a log of all sent alerts.
 * @version 1.0
 */
public class AlertSystem {
    private NotificationMedium notificationMedium;
    private ArrayList<String> alerts;

    /**
     * Constructs an AlertSystem object and initializes the alerts list. The notification medium can be set later using the setMedium method.
     */
    public AlertSystem() {
        this.alerts = new ArrayList<>();
    }

    /** 
     * Sets the notification medium for sending alerts. This method allows the user to specify how they want to receive notifications (e.g., email, SMS, app notification).
     * 
     * @param medium the NotificationMedium implementation to use for sending alerts
     * 
     * Used copilot Claude Haiku 4.5 to improve this method.
     * The prompt was: "How can I prevent the hash code of the medium from being printed?"
     * AI suggestion: Use getClass().getSimpleName() in setMedium
     * AI accepted changes: System.out.println("Setting notification medium to: " + medium.getClass().getSimpleName());
     * Original code: System.out.println("Setting notification medium to: " + medium);
     * I tested the change and it prevented the hash code from being printed. No other changes were needed.
    */
    public void setMedium(NotificationMedium medium) {
        System.out.println("Setting notification medium to: " + medium.getClass().getSimpleName());
        this.notificationMedium = medium;
    }

    /**
     * Sends a notification message to the user through the set notification medium. If no medium is set, it prints an error message.
     * @param message the alert message to send to the user
     */
    public void notifyUser(String message) {
        if (this.notificationMedium == null) {
            System.out.println("No notification medium set. Cannot send alert.");
        } else {
            this.notificationMedium.send(message);
            this.alerts.add(message);
        }
    }

    /**
     * Returns the list of alerts that have been sent.
     * 
     * @return alerts as an unmodifiable list to prevent external modification
     * 
     * Used copilot GPT-4.1 to improve this method. The prompt was: "How can I improve this method that returns the list of alerts?"
     * AI suggestion: You can improve the getAlerts method by returning an unmodifiable view of alerts log. This prevents external code from accidentally 
     * modifying your internal logs, which helps maintain encapsulation and data integrity.
     * 
     * AI accepted changes:
     * import java.util.Collections;
     * return Collections.unmodifiableList(alerts);
     * 
     * Original method return: return this.alerts;
     */
    public List<String> getAlerts() {
        return Collections.unmodifiableList(alerts);
    }

}
