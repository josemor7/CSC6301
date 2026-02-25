/**
 * @author Jose Morales
 * Date: 02/17/2026
 * Description: The Test Notifications class contains a main method to test the functionality of the AlertSystem with different notification mediums.
 * @version 2.0
 */
public class TestNotifications {
    /**
     * Main method to test the AlertSystem with different notification mediums (EmailService and SmsService). 
     * It demonstrates sending notifications and retrieving the alert log.
     * 
     * @param args
     * 
     * This method was created using copilot Claude Haiku 4.5. The prompt was: 
     * "Please finish the main method so that it tests all the functionality in the provided context."
     * Context provided to copilot: AlertSystem.java, EmailService.java, SmsService.java, NotificationMedium.java
     * 
     * AI generated code was reviewed and accepted with no changes as I believe it to effectively test different scenarios that may present themselves
     * when using the alert system.
     */
    public static void main(String[] args) {
        AlertSystem alertSystem = new AlertSystem();

        // Test 1: Try to notify without setting a medium
        System.out.println("=== Test 1: Notify without medium ===");
        alertSystem.notifyUser("Test message without medium");
        System.out.println();
        
        // Test 2: Set EmailService and send notifications
        System.out.println("=== Test 2: Send notifications via Email ===");
        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("User login detected");
        alertSystem.notifyUser("Password changed successfully");
        System.out.println();
        
        // Test 3: Switch to SmsService and send notifications
        System.out.println("=== Test 3: Send notifications via SMS ===");
        alertSystem.setMedium(new SmsService());
        alertSystem.notifyUser("Account locked due to suspicious activity");
        alertSystem.notifyUser("Two-factor authentication required");
        System.out.println();

        // Test 4: Send notifications via WhatsApp
        System.out.println("=== Test 4: Send notifications via WhatsApp===");
        alertSystem.setMedium(new WhatsAppService());
        alertSystem.notifyUser("The first message sent through WhatsApp");
        alertSystem.notifyUser("A test message sent through WhatsApp");
        /*
        AI (GPT-4.1) generated code:
        Prompt: Please add more to test WhatsAppService.java
        Prompt context: TestNotifications.java, WhatsAppService.java
        Accepted all changes as I believe they effectively test different scenarios that may present themselves when using the WhatsAppService as a notification medium.
         */
        // Long message
        StringBuilder longMsgBuilder = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            longMsgBuilder.append("WhatsAppLongMessage ");
        }
        alertSystem.notifyUser(longMsgBuilder.toString());
        // Special characters
        alertSystem.notifyUser("Special chars: ~!@#$%^&*()_+" );
        // Rapid multiple messages
        for (int i = 1; i <= 5; i++) {
            alertSystem.notifyUser("Rapid message #" + i + " via WhatsApp");
        }
        System.out.println();
        
        
        // Test 5: Display all alerts sent during the session
        System.out.println("=== Test 5: Display all alerts sent ===");
        System.out.println("Total alerts sent: " + alertSystem.getAlerts().size());
        for (int i = 0; i < alertSystem.getAlerts().size(); i++) {
            System.out.println((i + 1) + ". " + alertSystem.getAlerts().get(i));
        }
    }

}
