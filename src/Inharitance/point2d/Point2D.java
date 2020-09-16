package Inharitance.point2d;

import java.util.Arrays;

class Point2D {
    private float x;
    private float y;

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point2D() {
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }
}
