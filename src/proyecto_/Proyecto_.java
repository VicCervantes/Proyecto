/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_;

import java.util.ArrayList;

/**
 *
 * @author vicge
 */
public class Proyecto_ {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        Interfaz interfaz = new Interfaz(empleados);
        interfaz.setVisible(true);
        
    }
    
}
