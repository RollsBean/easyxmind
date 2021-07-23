package com.github.rollsbean.xmind.domain.internal;

import java.util.List;

/**
 * 子节点信息
 * <br/>
 * 未关联到根节点的也是根节点的 children
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class Children {

    /**
     * Subtopic
     */
    private List<Topic> attached;

    /**
     * Floating topic
     */
    private List<Topic> detached;
}
