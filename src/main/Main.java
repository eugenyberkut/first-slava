package main;

import java.util.Scanner;

public class Main {

    double eps = 1e-6;

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = x+y;
        System.out.printf("%3.1f + %3.1f = %3.1f\n",x,y,z);

    }

    public double f(double x) {
        if (x>3.4+eps) {
            return Math.sin(x)*Math.log10(x);
        } else {
            double c = Math.cos(x);
            return c*c;
        }
    }

    public int steps(double a, double b, double h) {
//        int k = 0;
//        for (double x=a; x<=b; x+=h) {
//            k++;
//        }
        return (int) ((b-a)/h+1);
    }

    public double[] createX(double a, double b, double h) {
        double[] x = new double[steps(a,b,h)];
        for (int i = 0; i < x.length; i++) {
            x[i] = a + i*h;
        }
        return x;
    }


    public int findMin(double[] a) {
        int res = 0;
        for (int i=1; i<a.length; i++) {
            if (a[i]<a[res]) res = i;
        }
        return res;
    }
}
