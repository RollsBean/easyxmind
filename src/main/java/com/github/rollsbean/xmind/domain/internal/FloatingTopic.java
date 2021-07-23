package com.github.rollsbean.xmind.domain.internal;

/**
 * 未关联到根节点的节点
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class FloatingTopic extends Topic{

    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
