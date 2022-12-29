/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocomposite;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Composite implements ISueldo {
    
    private ArrayList<ISueldo> empleado = new ArrayList<ISueldo>();

    @Override
    public double getSueldo() {
        double sumador = 0;
        for (int i = 0; i < empleado.size(); i++) {
            sumador = sumador + empleado.get(i).getSueldo();
        }
        return sumador;
    }

    public void agregar(ISueldo p) {
        empleado.add(p);
    }

}
