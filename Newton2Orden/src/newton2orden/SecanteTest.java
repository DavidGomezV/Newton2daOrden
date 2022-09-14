/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newton2orden;

/**
 *
 * @author david
 */
public class SecanteTest {
    public static void main(String[] args) {
        Funcion f = new Funcion("sin(x)*x");
        Secante s = new Secante();
        System.out.println(s.raiz(f, 3, 4, 100, 1e-6));
}
}