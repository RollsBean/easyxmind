package com.github.rollsbean.xmind.domain.internal;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
import java.util.Objects;

/**
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class Extension {

    private String provider;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public List<Content> getExtensionContent() {
        return extensionContent;
    }

    public void setExtensionContent(List<Content> extensionContent) {
        this.extensionContent = extensionContent;
    }

    @JSONField(name = "content")
    private List<Content> extensionContent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Extension extension = (Extension) o;
        return Objects.equals(provider, extension.provider) && Objects.equals(extensionContent, extension.extensionContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, extensionContent);
    }

    private class Content {

        private String name;

        private String content;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Content content1 = (Content) o;
            return Objects.equals(name, content1.name) && Objects.equals(content, content1.content);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, content);
        }
    }
}
