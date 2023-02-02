package NotificadorEventos.interfaces;


public interface NotificationManagement {
    void getNumberOfNotifications();
    void registerNotifications();
    void clearNotificationLogs();
    void printAllNotifications();
    Integer getNotificationsAmount();

}
