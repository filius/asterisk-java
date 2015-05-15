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
    private String channelstate;
    private String destchannel;
    private String destchannelstate;
    private String destcontext;
    private String destconnectedlinename;
    private String destexten;
    private String destuniqueid;
    private String destpriority;
    private String destcalleridname;
    private String destconnectedlinenum;
    private String destchannelstatedesc;
    private String destcalleridnum;

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

    public String getChannelstate() {
        return channelstate;
    }

    public void setChannelstate(String channelstate) {
        this.channelstate = channelstate;
    }

    public String getDestchannel() {
        return destchannel;
    }

    public void setDestchannel(String destchannel) {
        this.destchannel = destchannel;
    }

    public String getDestchannelstate() {
        return destchannelstate;
    }

    public void setDestchannelstate(String destchannelstate) {
        this.destchannelstate = destchannelstate;
    }

    public String getDestcontext() {
        return destcontext;
    }

    public void setDestcontext(String destcontext) {
        this.destcontext = destcontext;
    }

    public String getDestconnectedlinename() {
        return destconnectedlinename;
    }

    public void setDestconnectedlinename(String destconnectedlinename) {
        this.destconnectedlinename = destconnectedlinename;
    }

    public String getDestexten() {
        return destexten;
    }

    public void setDestexten(String destexten) {
        this.destexten = destexten;
    }

    public String getDestuniqueid() {
        return destuniqueid;
    }

    public void setDestuniqueid(String destuniqueid) {
        this.destuniqueid = destuniqueid;
    }

    public String getDestpriority() {
        return destpriority;
    }

    public void setDestpriority(String destpriority) {
        this.destpriority = destpriority;
    }

    public String getDestcalleridname() {
        return destcalleridname;
    }

    public void setDestcalleridname(String destcalleridname) {
        this.destcalleridname = destcalleridname;
    }

    public String getDestconnectedlinenum() {
        return destconnectedlinenum;
    }

    public void setDestconnectedlinenum(String destconnectedlinenum) {
        this.destconnectedlinenum = destconnectedlinenum;
    }

    public String getDestchannelstatedesc() {
        return destchannelstatedesc;
    }

    public void setDestchannelstatedesc(String destchannelstatedesc) {
        this.destchannelstatedesc = destchannelstatedesc;
    }

    public String getDestcalleridnum() {
        return destcalleridnum;
    }

    public void setDestcalleridnum(String destcalleridnum) {
        this.destcalleridnum = destcalleridnum;
    }
}
