package session;

import java.util.HashMap;

public class SessionManager {
    private HashMap<String, Session> sessionHashMap;

    public static SessionManager getInstance() {
        SessionManager sessionManager = new SessionManager();
        sessionManager.sessionHashMap = new HashMap<>();
        return sessionManager;
    }


    public Session getByKey(String sessionID) {
        return sessionHashMap.get(sessionID);
    }

    public String generateNewSession(String locationId) {
        Session session = Session.getInstance(locationId);
        this.sessionHashMap.put(session.getSessionId(), session);
        return session.getSessionId();
    }


    public boolean stopSession(String sessionId) {
        if (this.sessionHashMap.containsKey(sessionId)) {
            this.sessionHashMap.remove(sessionId);
            return  true;
        }
        return false;
    }
}
