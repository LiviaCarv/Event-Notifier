package NotificadorEventos.entitites;

public class Notification {
    private String personName;
    private String message;

    public Notification(String personName, String message) {
        this.personName = personName;
        this.message = message;
    }

    @Override
    public String toString() {
        return "{ " + personName
                + " received a message: -> " + message.trim()
                + " }";
    }
}
