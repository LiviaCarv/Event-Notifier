package NotificadorEventos.entitites;

import NotificadorEventos.interfaces.NotificationManagement;

import java.util.Scanner;

public class NotificationHandler implements NotificationManagement {
    private Integer notificationsAmount;
    private Scanner scanner = new Scanner(System.in);
    private Notification[] notificationsList;

    @Override
    public Integer getNotificationsAmount() {
        return notificationsAmount;
    }

    @Override
    public void getNumberOfNotifications() {
        System.out.println("Digite o numero de pessoas que devem ser notificadas: ");
        notificationsAmount = scanner.nextInt();
    }

    @Override
    public void registerNotifications() {
        notificationsList = new Notification[notificationsAmount];
        for (int contador = 0; contador < notificationsAmount; contador ++) {
            notificationsList[contador] = new Notification(getName(scanner), getMessage(scanner));
        }
    }

    @Override
    public void clearNotificationLogs() {
        notificationsAmount = null;
        notificationsList = null;
    }

    @Override
    public void printAllNotifications() {
        System.out.println("Notifications:");
        for (Notification notif: notificationsList) {
            System.out.println(notif.toString());
        }
    }

    public String getName(Scanner scanner) {
        System.out.println("Digite o nome: ");
        scanner.skip("((?<!\\R)\\s)*");
        return scanner.nextLine();
    }

    public String getMessage(Scanner scanner) {
        System.out.println("Digite a mensagem da notificação: ");
        scanner.skip("((?<!\\R)\\s)*");
        return scanner.nextLine();
    }
}
