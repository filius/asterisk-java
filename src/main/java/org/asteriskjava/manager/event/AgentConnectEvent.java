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
 * An AgentConnectEvent is triggered when a caller is connected to an agent.<p>
 * It is implemented in <code>apps/app_queue.c</code>.<p>
 * Available since Asterisk 1.2
 * 
 * @author srt
 * @version $Id$
 * @since 0.2
 */
public class AgentConnectEvent extends AbstractAgentEvent
{
    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = 0L;

    private Long holdTime;
    private String bridgedChannel;
    private Long ringtime;
    private String destchannel;
    private Integer destchannelstate;
    private String destcontext;
    private String destconnectedlinename;
    private String interfaceName;
    private String destexten;
    private String destuniqueid;
    private String connectedlinenum;
    private String channelstatedesc;
    private String destpriority;
    private String connectedlinename;
    private String destcalleridname;
    private String channelstate;
    private String destconnectedlinenum;
    private String destchannelstatedesc;
    private String destcalleridnum;

    public AgentConnectEvent(Object source)
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
     * Returns the unique ID of the queue member channel that is taking the
     * call. This is useful when trying to link recording filenames back to a
     * particular call from the queue.<p>
     * Available since Asterisk 1.4.
     * 
     * @return the unique ID of the queue member channel that is taking the
     *         call.
     */
    public String getBridgedChannel()
    {
        return bridgedChannel;
    }

    /**
     * Sets the unique ID of the queue member channel that is taking the call.
     * 
     * @param bridgedChannel the unique ID of the queue member channel that is
     *            taking the call.
     */
    public void setBridgedChannel(String bridgedChannel)
    {
        this.bridgedChannel = bridgedChannel;
    }

    /**
     * Returns the amount of time the agent's channel was ringing before answered.<p>
     * Available since Asterisk 1.6.
     *
     * @return the amount of time the agent's channel was ringing before answered in seconds.
     * @since 1.0.0
     */
    public Long getRingtime()
    {
        return ringtime;
    }

    public void setRingtime(Long ringtime)
    {
        this.ringtime = ringtime;
    }

    public String getDestchannel() {
        return destchannel;
    }

    public void setDestchannel(String destchannel) {
        this.destchannel = destchannel;
    }

    public Integer getDestchannelstate() {
        return destchannelstate;
    }

    public void setDestchannelstate(Integer destchannelstate) {
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

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
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

    public String getDestpriority() {
        return destpriority;
    }

    public void setDestpriority(String destpriority) {
        this.destpriority = destpriority;
    }

    public String getConnectedlinename() {
        return connectedlinename;
    }

    public void setConnectedlinename(String connectedlinename) {
        this.connectedlinename = connectedlinename;
    }

    public String getDestcalleridname() {
        return destcalleridname;
    }

    public void setDestcalleridname(String destcalleridname) {
        this.destcalleridname = destcalleridname;
    }

    public String getChannelstate() {
        return channelstate;
    }

    public void setChannelstate(String channelstate) {
        this.channelstate = channelstate;
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
