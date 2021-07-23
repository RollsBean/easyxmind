package com.github.rollsbean.xmind.domain.internal;

import java.util.Map;

/**
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class Theme {

    private InnerElement boundary;
    private InnerElement subTopic;
    private InnerElement summary;
    private InnerElement calloutTopic;
    private InnerElement summaryTopic;
    private InnerElement floatingTopic;
    private InnerElement importantTopic;
    private InnerElement expiredTopic;
    private InnerElement centralTopic;
    private InnerElement mainTopic;
    private InnerElement relationship;
    private InnerElement minorTopic;
    private InnerElement map;

    public InnerElement getBoundary() {
        return boundary;
    }

    public void setBoundary(InnerElement boundary) {
        this.boundary = boundary;
    }

    public InnerElement getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(InnerElement subTopic) {
        this.subTopic = subTopic;
    }

    public InnerElement getSummary() {
        return summary;
    }

    public void setSummary(InnerElement summary) {
        this.summary = summary;
    }

    public InnerElement getCalloutTopic() {
        return calloutTopic;
    }

    public void setCalloutTopic(InnerElement calloutTopic) {
        this.calloutTopic = calloutTopic;
    }

    public InnerElement getSummaryTopic() {
        return summaryTopic;
    }

    public void setSummaryTopic(InnerElement summaryTopic) {
        this.summaryTopic = summaryTopic;
    }

    public InnerElement getFloatingTopic() {
        return floatingTopic;
    }

    public void setFloatingTopic(InnerElement floatingTopic) {
        this.floatingTopic = floatingTopic;
    }

    public InnerElement getImportantTopic() {
        return importantTopic;
    }

    public void setImportantTopic(InnerElement importantTopic) {
        this.importantTopic = importantTopic;
    }

    public InnerElement getExpiredTopic() {
        return expiredTopic;
    }

    public void setExpiredTopic(InnerElement expiredTopic) {
        this.expiredTopic = expiredTopic;
    }

    public InnerElement getCentralTopic() {
        return centralTopic;
    }

    public void setCentralTopic(InnerElement centralTopic) {
        this.centralTopic = centralTopic;
    }

    public InnerElement getMainTopic() {
        return mainTopic;
    }

    public void setMainTopic(InnerElement mainTopic) {
        this.mainTopic = mainTopic;
    }

    public InnerElement getRelationship() {
        return relationship;
    }

    public void setRelationship(InnerElement relationship) {
        this.relationship = relationship;
    }

    public InnerElement getMinorTopic() {
        return minorTopic;
    }

    public void setMinorTopic(InnerElement minorTopic) {
        this.minorTopic = minorTopic;
    }

    public InnerElement getMap() {
        return map;
    }

    public void setMap(InnerElement map) {
        this.map = map;
    }

    private class InnerElement {
        String type;
        Map<String, String> properties;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Map<String, String> getProperties() {
            return properties;
        }

        public void setProperties(Map<String, String> properties) {
            this.properties = properties;
        }
    }

}
