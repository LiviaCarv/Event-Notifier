package NotificadorEventos.entitites;

import NotificadorEventos.interfaces.NotificationManagement;


public class EventNotifier {
    private NotificationManagement handler;

    public EventNotifier(NotificationManagement handler) {
        this.handler = handler;
    }

    public void notifier() {
        boolean continueProcess = true;
        do {
            handler.getNumberOfNotifications();
            if (handler.getNotificationsAmount() <= 0) {
                continueProcess = false;
            } else {
                handler.registerNotifications();
                handler.printAllNotifications();
                handler.clearNotificationLogs();
            }

        } while (continueProcess);
    }
}
