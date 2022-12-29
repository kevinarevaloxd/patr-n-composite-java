/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocomposite;

/**
 *
 * @author Kevin
 */
public class Empleado implements ISueldo {

    private String nombreCompleto, cargo;
    private double sueldo;

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empleado(String nombreCompleto, String cargo, double sueldo) {
        setNombreCompleto(nombreCompleto);
        setCargo(cargo);
        setSueldo(sueldo);
    }

}
