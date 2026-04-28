/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author hermi
 */
public class Empleado extends Persona {
    protected double salario;
    protected String idEmpleado;
    protected String fechaContratacion;
    protected String area;

    public Empleado(String nombre, int edad, String dni, String direccion, String numero, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String area) {
        super(nombre, edad, dni, direccion, numero);
        this.salario = salario;
        this.idEmpleado = idEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.area = area;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void trabajar(){
        System.out.println(nombre+" esta realizando labores generales.");
    }
    
    @Override
    public String toString(){
        return super.toString()+
                 " Salario: $"+salario+
                 " ID: "+idEmpleado+
                 " Area: "+area+
                 " Contratado: "+fechaContratacion;
    }
}
