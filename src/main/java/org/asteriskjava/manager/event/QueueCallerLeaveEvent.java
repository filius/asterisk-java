package org.asteriskjava.manager.event;

/**
 * User: fil
 * Date: 15.05.15
 */
public class QueueCallerLeaveEvent extends ManagerEvent {

    private String channel;
    private String uniqueid;
    private Integer count;
    private Integer position;
    private String queue;

    public QueueCallerLeaveEvent(Object source) {
        super(source);
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }
}
