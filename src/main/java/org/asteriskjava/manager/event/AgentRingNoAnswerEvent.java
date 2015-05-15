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
 * An AgentRingNoAnswerEvent is triggered when a call is routed to an agent but the agent
 * does not answer the call.<p>
 * It is implemented in <code>apps/app_queue.c</code>.<p>
 * Available since Asterisk 1.6
 *
 * @author srt
 * @version $Id$
 * @since 1.0.0
 */
public class AgentRingNoAnswerEvent extends AbstractAgentEvent
{
    private static final long serialVersionUID = 1L;

    private Long ringtime;
    private String destchannel;
    private Long destchannelstate;
    private String destcontext;
    private String calleridname;
    private String destconnectedlinename;
    private String interfaceName;
    private String exten;
    private String destexten;
    private String calleridnum;
    private String context;
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

    public AgentRingNoAnswerEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the amount of time the agent's channel was ringing.
     *
     * @return the amount of time the agent's channel was ringing in seconds.
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

    public Long getDestchannelstate() {
        return destchannelstate;
    }

    public void setDestchannelstate(Long destchannelstate) {
        this.destchannelstate = destchannelstate;
    }

    public String getDestcontext() {
        return destcontext;
    }

    public void setDestcontext(String destcontext) {
        this.destcontext = destcontext;
    }

    public String getCalleridname() {
        return calleridname;
    }

    public void setCalleridname(String calleridname) {
        this.calleridname = calleridname;
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

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    public String getDestexten() {
        return destexten;
    }

    public void setDestexten(String destexten) {
        this.destexten = destexten;
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