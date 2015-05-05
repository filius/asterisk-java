/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.manager.event;

/**
 * An AgentCompleteEvent is triggered when at the end of a call if the caller
 * was connected to an agent.<p>
 * It is implemented in <code>apps/app_queue.c</code>.<p>
 * Available since Asterisk 1.2
 * 
 * @author srt
 * @version $Id$
 * @since 0.2
 */
public class AgentCompleteEvent extends AbstractAgentEvent
{
    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = 2108033737226142194L;

    private Long holdTime;
    private Long talkTime;
    private String reason;
    private String interfaceName;
    private String calleridname;
    private String exten;
    private String calleridnum;
    private String context;
    private String connectedlinenum;
    private String channelstatedesc;
    private String connectedlinename;
    private String priority;
    private String channelstate;

    public AgentCompleteEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the amount of time the caller was on hold.
     * 
     * @return the amount of time the caller was on hold in seconds.
     */
    public Long getHoldTime()
    {
        return holdTime;
    }

    /**
     * Sets the amount of time the caller was on hold.
     * 
     * @param holdtime the amount of time the caller was on hold in seconds.
     */
    public void setHoldTime(Long holdtime)
    {
        this.holdTime = holdtime;
    }

    /**
     * Returns the amount of time the caller talked to the agent.
     * 
     * @return the amount of time the caller talked to the agent in seconds.
     */
    public Long getTalkTime()
    {
        return talkTime;
    }

    /**
     * Sets the amount of time the caller talked to the agent.
     * 
     * @param talkTime the amount of time the caller talked to the agent in
     *            seconds.
     */
    public void setTalkTime(Long talkTime)
    {
        this.talkTime = talkTime;
    }

    /**
     * Returns if the agent or the caller terminated the call.
     * 
     * @return "agent" if the agent terminated the call, "caller" if the caller
     *         terminated the call.
     */
    public String getReason()
    {
        return reason;
    }

    /**
     * Sets if the agent or the caller terminated the call.
     * 
     * @param reason "agent" if the agent terminated the call, "caller" if the
     *            caller terminated the call.
     */
    public void setReason(String reason)
    {
        this.reason = reason;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getCalleridname() {
        return calleridname;
    }

    public void setCalleridname(String calleridname) {
        this.calleridname = calleridname;
    }

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    public String getCalleridnum() {
        return calleridnum;
    }

    public void setCalleridnum(String calleridnum) {
        this.calleridnum = calleridnum;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getConnectedlinenum() {
        return connectedlinenum;
    }

    public void setConnectedlinenum(String connectedlinenum) {
        this.connectedlinenum = connectedlinenum;
    }

    public String getChannelstatedesc() {
        return channelstatedesc;
    }

    public void setChannelstatedesc(String channelstatedesc) {
        this.channelstatedesc = channelstatedesc;
    }

    public String getConnectedlinename() {
        return connectedlinename;
    }

    public void setConnectedlinename(String connectedlinename) {
        this.connectedlinename = connectedlinename;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getChannelstate() {
        return channelstate;
    }

    public void setChannelstate(String channelstate) {
        this.channelstate = channelstate;
    }
}
