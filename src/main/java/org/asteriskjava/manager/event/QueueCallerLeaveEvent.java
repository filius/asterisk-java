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
public class QueueCallerLeaveEvent extends QueueEvent {

    /**
     * Serializable version identifier
     */
    private static final long serialVersionUID = 812069706662063871L;

    private Integer position;
    private String language;

    public QueueCallerLeaveEvent(Object source) {
        super(source);
    }

    /**
     * @return the position of the caller at the time they abandoned the queue
     */
    public Integer getPosition(){
        return position;
    }

    /**
     * @param position the position of the caller at the time they abandoned the queue
     */
    public void setPosition(Integer position){
        this.position = position;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }
}
