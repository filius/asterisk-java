package org.asteriskjava.manager.event;

/**
 * User: fil
 * Date: 07.05.15
 */
public class InvalidPasswordEvent extends ManagerEvent {

    private String challenge;
    private String remoteaddress;
    private String service;
    private String receivedchallenge;
    private String accountid;
    private String localaddress;
    private String receivedhash;
    private String sessionid;
    private String eventtv;
    private String eventversion;
    private String severity;

    public InvalidPasswordEvent(Object source) {
        super(source);
    }

    public String getChallenge() {
        return challenge;
    }

    public void setChallenge(String challenge) {
        this.challenge = challenge;
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

    public String getReceivedchallenge() {
        return receivedchallenge;
    }

    public void setReceivedchallenge(String receivedchallenge) {
        this.receivedchallenge = receivedchallenge;
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

    public String getReceivedhash() {
        return receivedhash;
    }

    public void setReceivedhash(String receivedhash) {
        this.receivedhash = receivedhash;
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
