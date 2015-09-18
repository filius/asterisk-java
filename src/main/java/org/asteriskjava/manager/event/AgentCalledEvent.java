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

import java.util.Map;

/**
 * An AgentCalledEvent is triggered when an agent is rung. <br>
 * To enable AgentCalledEvents you have to set
 * <code>eventwhencalled = yes</code> in <code>queues.conf</code>. <br>
 * This event is implemented in <code>apps/app_queue.c</code>
 *
 * @author srt
 * @version $Id$
 */
public class AgentCalledEvent extends ManagerEvent
{
    /**
     * Serializable version identifier.
     */
    private static final long serialVersionUID = 1L;
    private String queue;
    private String agentCalled;
    private String agentName;
    private String channelCalling;
    private String destinationChannel;
    private String uniqueId;
    private String destchannel;
    private Integer destchannelstate;
    private String destcontext;
    private String destconnectedlinename;
    private String channel;
    private String interfaceName;
    private String exten;
    private String destexten;
    private String destuniqueid;
    private String channelstatedesc;
    private Integer destpriority;
    private String destcalleridname;
    private Integer channelstate;
    private String destconnectedlinenum;
    private String destchannelstatedesc;
    private String destcalleridnum;
    private String memberName;

    private Map<String, String> variables;

    /**
     * @param source
     */
    public AgentCalledEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the name of the queue.
     * <p>
     * Available since Asterisk 1.6.
     *
     * @return the name of the queue.
     * @since 1.0.0
     */
    public String getQueue()
    {
        return queue;
    }

    public void setQueue(String queue)
    {
        this.queue = queue;
    }

    /**
     * Returns the member interface of the agent that has been called.
     *
     * @return the member interface of the agent that has been called.
     * @see QueueMemberEvent#getLocation()
     */
    public String getAgentCalled()
    {
        return agentCalled;
    }

    /**
     * Sets the member interface of the agent that has been called.
     *
     * @param agentCalled the member interface of the agent that has been
     *            called.
     */
    public void setAgentCalled(String agentCalled)
    {
        this.agentCalled = agentCalled;
    }

    /**
     * Returns the name of the agent that has been called.
     * <p>
     * Available since Asterisk 1.6.
     *
     * @return the name of the agent that has been called.
     * @since 1.0.0
     */
    public String getAgentName()
    {
        return agentName;
    }

    public void setAgentName(String agentName)
    {
        this.agentName = agentName;
    }

    /**
     * Returns the name of the caller's channel that is about to be handled by
     * the agent.
     *
     * @return the name of the caller's channel.
     */
    public String getChannelCalling()
    {
        return channelCalling;
    }

    /**
     * Sets the name of the caller's channel.
     *
     * @param channelCalling the name of the caller's channel.
     */
    public void setChannelCalling(String channelCalling)
    {
        this.channelCalling = channelCalling;
    }

    /**
     * Returns the name of the channel calling the agent.
     * <p>
     * Available since Asterisk 1.6
     *
     * @return the name of the channel calling the agent.
     * @since 1.0.0
     */
    public String getDestinationChannel()
    {
        return destinationChannel;
    }

    public void setDestinationChannel(String destinationChannel)
    {
        this.destinationChannel = destinationChannel;
    }

    /**
     * Returns the Caller ID number of the caller's channel.
     *
     * @return the Caller ID number of the caller's channel.
     * @deprecated as of 1.0.0, use {@link #getCallerIdNum()} instead.
     */
    @Deprecated
    public String getCallerId()
    {
        return callerIdNum;
    }

    /**
     * Sets the Caller ID number of the caller's channel.
     *
     * @param callerId the Caller ID number of the caller's channel.
     */
    public void setCallerId(String callerId)
    {
        this.callerIdNum = callerId;
    }

    public String getExtension()
    {
        return exten;
    }

    public void setExtension(String extension)
    {
        this.exten = extension;
    }

    /**
     * Returns the unique id of the caller's channel that is about to be handled
     * by the agent. This corresponds to {@link #getChannelCalling()}.
     * <p>
     * Available since Asterisk 1.6
     *
     * @return the unique id of the caller's channel.
     * @since 1.0.0
     */
    public String getUniqueId()
    {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId)
    {
        this.uniqueId = uniqueId;
    }

    /**
     * Returns the channel variables if <code>eventwhencalled</code> is set to
     * <code>vars</code> in <code>queues.conf</code>.
     * <p>
     * Available since Asterisk 1.6
     *
     * @return the channel variables.
     * @since 1.0.0
     */
    public Map<String, String> getVariables()
    {
        return variables;
    }

    /**
     * Sets the channel variables.
     * <p>
     * Available since Asterisk 1.6
     *
     * @param variables the channel variables.
     * @since 1.0.0
     */
    public void setVariables(Map<String, String> variables)
    {
        this.variables = variables;
    }

    /**
     * Returns the Caller*ID name of the channel connected if set.
     * If the channel has no caller id set "unknown" is returned.
     *
     * @since 1.0.0
     */

    /**
     * Returns the Caller*ID number of the channel connected if set.
     * If the channel has no caller id set "unknown" is returned.
     *
     * @since 1.0.0
     */

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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
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

    public String getChannelstatedesc() {
        return channelstatedesc;
    }

    public void setChannelstatedesc(String channelstatedesc) {
        this.channelstatedesc = channelstatedesc;
    }

    public Integer getDestpriority() {
        return destpriority;
    }

    public void setDestpriority(Integer destpriority) {
        this.destpriority = destpriority;
    }

    public String getDestcalleridname() {
        return destcalleridname;
    }

    public void setDestcalleridname(String destcalleridname) {
        this.destcalleridname = destcalleridname;
    }

    public Integer getChannelstate() {
        return channelstate;
    }

    public void setChannelstate(Integer channelstate) {
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

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
