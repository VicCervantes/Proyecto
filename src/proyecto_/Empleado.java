/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_;

/**
 *
 * @author vicge
 */
public class Empleado extends Persona {

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String sexo, String fechaNacimiento,
                    String nombreEmpresa, String giroEmpresa, String claveEmpleado, String departamento, String puesto,
                    int horasTrabajadas, double pagoPorHora, String fechaIngreso) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, sexo, fechaNacimiento, nombreEmpresa, giroEmpresa, claveEmpleado, departamento, puesto, horasTrabajadas, pagoPorHora, fechaIngreso);
    }

    @Override
    public double calcularSueldoNeto() {
        return calcularSueldoNormal() + calcularHorasExtras();
    }
    
    public double calcularHorasExtras() {
        int horasExtras = horasTrabajadas > 40 ? horasTrabajadas - 40 : 0;
        return horasExtras * (pagoPorHora * 1.5);
    }

    public double calcularSueldoNormal() {
        return Math.min(horasTrabajadas, 40) * pagoPorHora;
    }

    public String mostrarInformacionEmpleado() {
        return "Nombre: " + getNombre() + " " + getApellidoPaterno() + " " + getApellidoMaterno() + "\n" +
               "Edad: " + getEdad() + "\n" +
               "Sexo: " + getSexo() + "\n" +
               "Fecha de Nacimiento: " + getFechaNacimiento() + "\n" +
               "Clave de Empleado: " + claveEmpleado + "\n" +
               "Departamento: " + departamento + "\n" +
               "Puesto: " + puesto + "\n" +
               "Fecha de Ingreso: " + fechaIngreso + "\n" +
               "Horas Trabajadas: " + horasTrabajadas + "\n" +
               "Pago por Hora: $" + pagoPorHora + "\n" +
               "Sueldo Normal: $" + calcularSueldoNormal() + "\n" +
               "Horas Extras: $" + calcularHorasExtras() + "\n" +
               "Sueldo Neto: $" + calcularSueldoNeto();
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido paterno: " + apellidoPaterno);
        System.out.println("Apellido materno: " + apellidoMaterno);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Nombre de empresa: " + nombreEmpresa);
        System.out.println("Giro de empresa: " + giroEmpresa);
        System.out.println("Clave de Empleado: " + claveEmpleado);
        System.out.println("Departamento: " + departamento);
        System.out.println("Puesto: " + puesto);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Sueldo normal" + calcularSueldoNormal());
        System.out.println("Horas extras" + calcularHorasExtras());
        System.out.println("Sueldo neto"+ calcularSueldoNeto());
    }

}
