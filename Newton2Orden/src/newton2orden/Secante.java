/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newton2orden;

/**
 *
 * @author david
 */
public class Secante {
    public double raiz(Funcion f, double x0, double x1, int c, double e){
        double r = Double.NaN;
        double x2 = x0;
        int k = 0;
        while(Math.abs(f.eval(x2))>e&&k<c){
            x2 = x0-f.eval(x0)*(x1-x0)/(f.eval(x1)-f.eval(x0));
            x0=x1;
            x1=x2;
            k++;
        }
        if (k<c){
            r=x2;
        }
        return r;
    }
}
