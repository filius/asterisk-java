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
    private String channelCalling;
    private String destinationChannel;
    private String uniqueId;
    private String destChannel;
    private Integer destChannelState;
    private String destContext;
    private String destConnectedLineName;
    private String channel;
    private String interfaceName;
    private String exten;
    private String destExten;
    private String destUniqueId;
    private Integer destPriority;
    private String destCallerIdName;
    private String destConnectedLineNum;
    private String destChannelStateDesc;
    private String destCallerIdNum;
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
     * @deprecated use {@lkink #getMemberName()} instead (asterisk 13)
     */
    @Deprecated
    public String getAgentName()
    {
        return memberName;
    }

    @Deprecated
    public void setAgentName(String agentName)
    {
        this.memberName = agentName;
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
     * Returns the Queue Member name.
     * <p>
     * Available since Asterisk 13 replace agentName
     * </p>
     *
     */
    public String getMemberName() {  return memberName;}

    public void setMemberName(String memberName) { this.memberName = memberName; }

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

    public String getDestChannel() {
        return destChannel;
    }

    public void setDestChannel(String destChannel) {
        this.destChannel = destChannel;
    }

    public Integer getDestChannelState() {
        return destChannelState;
    }

    public void setDestChannelState(Integer destChannelState) {
        this.destChannelState = destChannelState;
    }

    public String getDestContext() {
        return destContext;
    }

    public void setDestContext(String destContext) {
        this.destContext = destContext;
    }

    public String getDestConnectedLineName() {
        return destConnectedLineName;
    }

    public void setDestConnectedLineName(String destConnectedLineName) {
        this.destConnectedLineName = destConnectedLineName;
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

    public String getDestExten() {
        return destExten;
    }

    public void setDestExten(String destExten) {
        this.destExten = destExten;
    }

    public String getDestUniqueId() {
        return destUniqueId;
    }

    public void setDestUniqueId(String destUniqueId) {
        this.destUniqueId = destUniqueId;
    }

    public Integer getDestPriority() {
        return destPriority;
    }

    public void setDestPriority(Integer destPriority) {
        this.destPriority = destPriority;
    }

    public String getDestCallerIdName() {
        return destCallerIdName;
    }

    public void setDestCallerIdName(String destCallerIdName) {
        this.destCallerIdName = destCallerIdName;
    }

    public String getDestConnectedLineNum() {
        return destConnectedLineNum;
    }

    public void setDestConnectedLineNum(String destConnectedLineNum) {
        this.destConnectedLineNum = destConnectedLineNum;
    }

    public String getDestChannelStateDesc() {
        return destChannelStateDesc;
    }

    public void setDestChannelStateDesc(String destChannelStateDesc) {
        this.destChannelStateDesc = destChannelStateDesc;
    }

    public String getDestCallerIdNum() {
        return destCallerIdNum;
    }

    public void setDestCallerIdNum(String destCallerIdNum) {
        this.destCallerIdNum = destCallerIdNum;
    }

}
