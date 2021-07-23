package com.github.rollsbean.xmind.domain.internal;

import java.util.Objects;

/**
 * Xmind 节点的图片信息
 * <br/>
 * 一个节点只有一张图片
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class Image {

    /**
     * 例如：xap:resources/d62082a7a474347c228ecddd169a38efa31b3d26dc7dc6f76e22798e0cc920b3.png
     */
    private String src;

    private int width;

    private int height;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return width == image.width && height == image.height && Objects.equals(src, image.src);
    }

    @Override
    public int hashCode() {
        return Objects.hash(src, width, height);
    }
}
