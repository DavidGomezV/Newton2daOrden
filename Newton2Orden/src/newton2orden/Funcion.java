
package newton2orden;

import org.nfunk.jep.JEP;

/**
 *
 * @author david
 */
public class Funcion {
    JEP j = new JEP();

    public Funcion(String def) {
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
        j.parseExpression(def);
        if(j.hasError()){
            System.out.println(j.getErrorInfo());
        }
    }
    
   
    public double eval(double x){
        double r;
        j.addVariable("x", x);
        r=j.getValue();
        if(j.hasError()){
            j.getErrorInfo();
        }
        return r;
    }
}
