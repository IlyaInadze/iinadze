package ru.job4j.condition;
public class Triangle {
 private Point a;
private Point b;
private Point c;
public Triangle(Point a, Point b, Point c) {
   this.a = a;
        this.b = b;
        this.c = c;
    }
   public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }
    public double area() {
        double ab = this.a.distance(this.b);
        double ac = this.a.distance(this.c);
       double bc = this.b.distance(this.c);
        double p = this.period(ab, ac, bc);
        return (this.exist(ab, ac, bc)) ? Math.sqrt(p * (p - ab) * (p - ac) * (p - bc)) : -1;
    }
    private boolean exist(double ab, double ac, double bc) {
        return ((ab + bc) < ac) || ((ac + bc) < ab) || ((ab + ac) < bc) ? false : true;
        }
    }
