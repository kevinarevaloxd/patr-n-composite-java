/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancocomposite;

/**
 *
 * @author Kevin
 */
public class TAcomposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos instancia del banco
        Banco banco = new Banco();
        
        //Creamos las instancias de cada clase
        SectorAdministrativo administracion = new SectorAdministrativo();
        SectorCajas cajas = new SectorCajas();
        SectorContaduria contaduria = new SectorContaduria();
        SectorGerencia gerencia = new SectorGerencia();
        SectorRRHH rrhh = new SectorRRHH();
        
        //Usamos el método heredado de la clase Composite en la instancia de nuestra clase Banco.
        banco.agregar(administracion);
        banco.agregar(contaduria);
        banco.agregar(gerencia);
        banco.agregar(cajas);
        banco.agregar(rrhh);
        
        Empleado administrador1 = new Empleado("Maria","Administrador",3000);
        
        Empleado cajero1 = new Empleado("Nafer Salas","Cajero", 500);
        Empleado cajero2 = new Empleado("Nafer Salas","Cajero", 1000);
        Empleado gerente1 = new Empleado("Kevin Arevalo", "Gerente", 2000);
        
        
        administracion.agregar(administrador1);
        cajas.agregar(cajero1);
        cajas.agregar(cajero2);
        gerencia.agregar(gerente1);
        System.out.println("Ingresos sector Administracion: " + administracion.getSueldo()); 
        System.out.println("Ingresos sector Caja: " + cajas.getSueldo());
        System.out.println("Ingresos sector Gerencia: " + gerencia.getSueldo());
        
        //Ingresos totales de todos los sectores
        System.out.println("Ingresos totales: " + banco.getSueldo());
    }
    
}
