package org.asteriskjava.manager.event;

/**
 * User: fil
 * Date: 07.05.15
 */
public class SuccessfulAuthEvent extends ManagerEvent {

    private String remoteaddress;
    private String service;
    private String accountid;
    private String localaddress;
    private String sessionid;
    private String eventtv;
    private String usingpassword;
    private String eventversion;
    private String severity;

    public SuccessfulAuthEvent(Object source) {
        super(source);
    }

    public String getRemoteaddress() {
        return remoteaddress;
    }

    public void setRemoteaddress(String remoteaddress) {
        this.remoteaddress = remoteaddress;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getLocaladdress() {
        return localaddress;
    }

    public void setLocaladdress(String localaddress) {
        this.localaddress = localaddress;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getEventtv() {
        return eventtv;
    }

    public void setEventtv(String eventtv) {
        this.eventtv = eventtv;
    }

    public String getUsingpassword() {
        return usingpassword;
    }

    public void setUsingpassword(String usingpassword) {
        this.usingpassword = usingpassword;
    }

    public String getEventversion() {
        return eventversion;
    }

    public void setEventversion(String eventversion) {
        this.eventversion = eventversion;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
