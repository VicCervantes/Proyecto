/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_;

/**
 *
 * @author vicge
 */
public class Empresa {
    protected String nombreEmpresa;
    protected String giroEmpresa;
    
    public Empresa(String nombreEmpresa, String giroEmpresa){
        this.nombreEmpresa = nombreEmpresa;
        this.giroEmpresa = giroEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getGiroEmpresa() {
        return giroEmpresa;
    }

    public void setGiroEmpresa(String giroEmpresa) {
        this.giroEmpresa = giroEmpresa;
    }
}