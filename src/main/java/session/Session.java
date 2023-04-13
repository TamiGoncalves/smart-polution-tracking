package session;

public class Session {

    private String sessionId;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;

    public Session(String sessionId, String location) {
        this.sessionId = sessionId;
    }

    static Session getInstance(String location) {
        String sessionId = "sessionId";
        sessionId +=System.nanoTime();
        return new Session(sessionId, location);
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
