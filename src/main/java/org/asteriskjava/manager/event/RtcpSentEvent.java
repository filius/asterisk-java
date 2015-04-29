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

import java.net.InetAddress;

/**
 * An RtcpSentEvent is triggered when Asterisk sends an RTCP message.<p>
 * Available since Asterisk 1.6<p>
 * It is implemented in <code>main/rtp.c</code>
 *
 * @author srt
 * @version $Id$
 * @since 1.0.0
 */
public class RtcpSentEvent extends AbstractRtcpEvent
{
    private static final long serialVersionUID = 1L;

    private InetAddress toAddress;
    private Integer toPort;
    private Long ourSsrc;
    private Double sentNtp;
    private Long sentRtp;
    private Long sentPackets;
    private Long sentOctets;
    private Long cumulativeLoss;
    private Long theirLastSr;
    private String report0lsr;
    private String calleridname;
    private String pt;
    private String channel;
    private String report0sourcessrc;
    private String exten;
    private String report0dlsr;
    private String calleridnum;
    private String context;
    private String from;
    private String connectedlinenum;
    private String uniqueid;
    private String channelstatedesc;
    private String reportcount;
    private String report0cumulativelost;
    private String report0sequencenumbercycles;
    private String ssrc;
    private String connectedlinename;
    private String priority;
    private String report0highestsequence;
    private String channelstate;
    private String report0fractionlost;
    private String report0iajitter;

    public RtcpSentEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the IP address the RTCP message has been sent to.
     *
     * @return the IP address the RTCP message has been sent to.
     */
    public InetAddress getToAddress()
    {
        return toAddress;
    }

    /**
     * Returns the port the RTCP message has been sent to.
     *
     * @return the port the RTCP message has been sent to.
     */
    public Integer getToPort()
    {
        return toPort;
    }

    public void setTo(String to)
    {
        // Format is "%s:%d"
        this.toAddress = stringToAddress(to);
        this.toPort = stringToPort(to);
    }

    /**
     * Returns our synchronization source identifier that uniquely identifies the source of a stream.
     * @return our synchronization source identifier.
     */
    public Long getOurSsrc()
    {
        return ourSsrc;
    }

    public void setOurSsrc(Long ourSsrc)
    {
        this.ourSsrc = ourSsrc;
    }

    public Double getSentNtp()
    {
        return sentNtp;
    }

    public void setSentNtp(Double sentNtp)
    {
        this.sentNtp = sentNtp;
    }

    public Long getSentRtp()
    {
        return sentRtp;
    }

    public void setSentRtp(Long sentRtp)
    {
        this.sentRtp = sentRtp;
    }

    /**
     * Returns the number of packets sent.
     *
     * @return the number of packets sent.
     */
    public Long getSentPackets()
    {
        return sentPackets;
    }

    public void setSentPackets(Long sentPackets)
    {
        this.sentPackets = sentPackets;
    }

    /**
     * Returns the number of octets (bytes) sent.
     *
     * @return the number of octets (bytes) sent.
     */
    public Long getSentOctets()
    {
        return sentOctets;
    }

    public void setSentOctets(Long sentOctets)
    {
        this.sentOctets = sentOctets;
    }

    public Long getCumulativeLoss()
    {
        return cumulativeLoss;
    }

    public void setCumulativeLoss(Long cumulativeLoss)
    {
        this.cumulativeLoss = cumulativeLoss;
    }

    public Long getTheirLastSr()
    {
        return theirLastSr;
    }

    public void setTheirLastSr(Long theirLastSr)
    {
        this.theirLastSr = theirLastSr;
    }

    public void setToAddress(InetAddress toAddress) {
        this.toAddress = toAddress;
    }

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    public String getReport0lsr() {
        return report0lsr;
    }

    public void setReport0lsr(String report0lsr) {
        this.report0lsr = report0lsr;
    }

    public String getCalleridname() {
        return calleridname;
    }

    public void setCalleridname(String calleridname) {
        this.calleridname = calleridname;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getReport0sourcessrc() {
        return report0sourcessrc;
    }

    public void setReport0sourcessrc(String report0sourcessrc) {
        this.report0sourcessrc = report0sourcessrc;
    }

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    public String getReport0dlsr() {
        return report0dlsr;
    }

    public void setReport0dlsr(String report0dlsr) {
        this.report0dlsr = report0dlsr;
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

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getConnectedlinenum() {
        return connectedlinenum;
    }

    public void setConnectedlinenum(String connectedlinenum) {
        this.connectedlinenum = connectedlinenum;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getChannelstatedesc() {
        return channelstatedesc;
    }

    public void setChannelstatedesc(String channelstatedesc) {
        this.channelstatedesc = channelstatedesc;
    }

    public String getReportcount() {
        return reportcount;
    }

    public void setReportcount(String reportcount) {
        this.reportcount = reportcount;
    }

    public String getReport0cumulativelost() {
        return report0cumulativelost;
    }

    public void setReport0cumulativelost(String report0cumulativelost) {
        this.report0cumulativelost = report0cumulativelost;
    }

    public String getReport0sequencenumbercycles() {
        return report0sequencenumbercycles;
    }

    public void setReport0sequencenumbercycles(String report0sequencenumbercycles) {
        this.report0sequencenumbercycles = report0sequencenumbercycles;
    }

    public String getSsrc() {
        return ssrc;
    }

    public void setSsrc(String ssrc) {
        this.ssrc = ssrc;
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

    public String getReport0highestsequence() {
        return report0highestsequence;
    }

    public void setReport0highestsequence(String report0highestsequence) {
        this.report0highestsequence = report0highestsequence;
    }

    public String getChannelstate() {
        return channelstate;
    }

    public void setChannelstate(String channelstate) {
        this.channelstate = channelstate;
    }

    public String getReport0fractionlost() {
        return report0fractionlost;
    }

    public void setReport0fractionlost(String report0fractionlost) {
        this.report0fractionlost = report0fractionlost;
    }

    public String getReport0iajitter() {
        return report0iajitter;
    }

    public void setReport0iajitter(String report0iajitter) {
        this.report0iajitter = report0iajitter;
    }
}