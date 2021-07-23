package com.github.rollsbean.xmind.domain.internal;

import java.util.Map;
import java.util.Objects;

/**
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class Style {

    private String type;

    private Map<String, String> properties;

    private String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Style style = (Style) o;
        return Objects.equals(type, style.type) && Objects.equals(properties, style.properties) && Objects.equals(id, style.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, properties, id);
    }
}
