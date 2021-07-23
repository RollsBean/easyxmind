package com.github.rollsbean.xmind.domain.internal;

import java.util.List;
import java.util.Objects;

/**
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class Topic {

    private String id;

    private String titleText;

    private List<Extension> extensions;

    private List<Topic> children;

    private Style style;

    private List<Theme> theme;

    private String title;

    private Boolean isRoot;

    /**
     * 示例：org.xmind.ui.map.clockwise
     */
    private String structureClass;

    private Image image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public List<Extension> getExtensions() {
        return extensions;
    }

    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    public List<Topic> getChildren() {
        return children;
    }

    public void setChildren(List<Topic> children) {
        this.children = children;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public List<Theme> getTheme() {
        return theme;
    }

    public void setTheme(List<Theme> theme) {
        this.theme = theme;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getRoot() {
        return isRoot;
    }

    public void setRoot(Boolean root) {
        isRoot = root;
    }

    public String getStructureClass() {
        return structureClass;
    }

    public void setStructureClass(String structureClass) {
        this.structureClass = structureClass;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return Objects.equals(id, topic.id) && Objects.equals(titleText, topic.titleText) && Objects.equals(extensions, topic.extensions) && Objects.equals(children, topic.children) && Objects.equals(style, topic.style) && Objects.equals(theme, topic.theme) && Objects.equals(title, topic.title) && Objects.equals(isRoot, topic.isRoot) && Objects.equals(structureClass, topic.structureClass) && Objects.equals(image, topic.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titleText, extensions, children, style, theme, title, isRoot, structureClass, image);
    }
}
