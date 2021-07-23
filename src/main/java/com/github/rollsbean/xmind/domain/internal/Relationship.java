package com.github.rollsbean.xmind.domain.internal;

import java.util.List;
import java.util.Objects;

/**
 * Xmind 链接关系
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class Relationship {

    private String id;

    private String end1Id;

    private String end2Id;

    private List<Position> controlPoints;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnd1Id() {
        return end1Id;
    }

    public void setEnd1Id(String end1Id) {
        this.end1Id = end1Id;
    }

    public String getEnd2Id() {
        return end2Id;
    }

    public void setEnd2Id(String end2Id) {
        this.end2Id = end2Id;
    }

    public List<Position> getControlPoints() {
        return controlPoints;
    }

    public void setControlPoints(List<Position> controlPoints) {
        this.controlPoints = controlPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relationship that = (Relationship) o;
        return Objects.equals(id, that.id) && Objects.equals(end1Id, that.end1Id) && Objects.equals(end2Id, that.end2Id) && Objects.equals(controlPoints, that.controlPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, end1Id, end2Id, controlPoints);
    }

    private class Position {

        private int x;

        private int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
