package org.example;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int setPointX(int num){
        return x = num;
    }

    public int setPointY(int num){
        return y = num;
    }

    public double distance(){
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p){
        return Math.sqrt((p.getX() - x) * (p.getX() - x) + (p.getY() - y) * (p.getY() - y));
    }

    public double distance(int a, int b) {
        return Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
    }
}
