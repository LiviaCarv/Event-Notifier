package NotificadorEventos.application;

import NotificadorEventos.entitites.EventNotifier;
import NotificadorEventos.entitites.NotificationHandler;

public class Program {

    public static void main(String[] args) {

        EventNotifier eventNotifier = new EventNotifier(new NotificationHandler());

        eventNotifier.notifier();
    }
}
