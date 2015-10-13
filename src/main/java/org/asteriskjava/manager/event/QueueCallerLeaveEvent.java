package org.asteriskjava.manager.event;

    /**
     * A QueueCallerLeaveEvent is triggered when a caller leave a queue before
     * getting connected with an agent.
     * <p>
     * It is implemented in <code>apps/app_queue.c</code>
     * <p>
     * Available since Asterisk 1.4.
     *
     * @author Leonardo de Souza
     */
public class QueueCallerLeaveEvent extends ManagerEvent {

    /**
     * Serializable version identifier
     */
    private static final long serialVersionUID = 812069706662063871L;

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

    /**
     * @return the position of the caller at the time they abandoned the queue
     */
    public Integer getPosition()
    {
        return position;
    }

    /**
     * @param position the position of the caller at the time they abandoned the
     *            queue
     */
    public void setPosition(Integer position)
    {
        this.position = position;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

}
