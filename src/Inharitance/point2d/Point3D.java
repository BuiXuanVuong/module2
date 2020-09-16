package Inharitance.point2d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    Point3D(){
    }
    public void setZ(float z){
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z){
        super.getXY();
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getZ();
        return arr;
    }

    @Override
    public String toString(){
        return Arrays.toString(getXYZ());
    }

}
