package com.github.rollsbean.xmind.domain.internal;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class Content{
    @NotNull
    private String id;

    private Topic rootTopic;

    private List<Relationship> relationships;

    private Style style;

    private String title;

    private Theme theme;

    /**
     * 例如：fixed
     */
    private String topicPositioning;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Topic getRootTopic() {
        return rootTopic;
    }

    public void setRootTopic(Topic rootTopic) {
        this.rootTopic = rootTopic;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public String getTopicPositioning() {
        return topicPositioning;
    }

    public void setTopicPositioning(String topicPositioning) {
        this.topicPositioning = topicPositioning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return Objects.equals(id, content.id) && Objects.equals(rootTopic, content.rootTopic) && Objects.equals(relationships, content.relationships) && Objects.equals(style, content.style) && Objects.equals(title, content.title) && Objects.equals(theme, content.theme) && Objects.equals(topicPositioning, content.topicPositioning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rootTopic, relationships, style, title, theme, topicPositioning);
    }
}
