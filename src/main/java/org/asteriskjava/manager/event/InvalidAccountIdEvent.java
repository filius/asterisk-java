package org.asteriskjava.manager.event;

/**
 * @author fil
 */
public class InvalidAccountIdEvent extends ManagerEvent {

    private static final long serialVersionUID = -6583463428239908491L;

    private String sessionId;
    private String accountId;
    private String event;
    private String severity;
    private String eventVersion;
    private String sessiontv;
    private String eventtv;
    private String service;
    private String localAddress;
    private String remoteAddress;

    public InvalidAccountIdEvent(Object source) {
        super(source);
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getEventVersion() {
        return eventVersion;
    }

    public void setEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
    }

    public String getSessiontv() {
        return sessiontv;
    }

    public void setSessiontv(String sessiontv) {
        this.sessiontv = sessiontv;
    }

    public String getEventtv() {
        return eventtv;
    }

    public void setEventtv(String eventtv) {
        this.eventtv = eventtv;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
}
