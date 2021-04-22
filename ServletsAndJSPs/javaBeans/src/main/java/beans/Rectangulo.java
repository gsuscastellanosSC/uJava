package beans;

public class Rectangulo {

    private int base;
    private int h;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getArea() {
        return this.base * this.h;
    }
}
