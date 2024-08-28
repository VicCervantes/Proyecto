/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_;

/**
 *
 * @author vicge
 */
public abstract class Persona {
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected int edad;
    protected String sexo;
    protected String fechaNacimiento;
    protected String nombreEmpresa;
    protected String giroEmpresa;
    protected String claveEmpleado; // Movido desde Empleado
    protected String departamento;  // Movido desde Empleado
    protected String puesto;        // Movido desde Empleado
    protected int horasTrabajadas;  // Movido desde Empleado
    protected double pagoPorHora;   // Movido desde Empleado
    protected String fechaIngreso;  // Movido desde Empleado

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String sexo, String fechaNacimiento,
                   String nombreEmpresa, String giroEmpresa, String claveEmpleado, String departamento, String puesto,
                   int horasTrabajadas, double pagoPorHora, String fechaIngreso) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreEmpresa = nombreEmpresa;
        this.giroEmpresa = giroEmpresa;
        this.claveEmpleado = claveEmpleado;
        this.departamento = departamento;
        this.puesto = puesto;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    


    

    public abstract double calcularSueldoNeto();


}