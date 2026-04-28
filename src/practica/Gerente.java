/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author hermi
 */
public class Gerente extends Empleado implements Evaluador {
    private String departamento;
    private int personasACargo;
    private double presupuesto;
    private String frecuenciaReuniones;
    
    public Gerente(String nombre, int edad, String documentoIdentidad,  String direccion, String numeroContacto, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String area, String departamento, int personasACargo, double presupuesto, String frecuenciaReuniones) {
        super(nombre, edad, documentoIdentidad, direccion, numeroContacto, salario, idEmpleado, fechaContratacion, tipoContrato, area);
        this.departamento = departamento;
        this.personasACargo = personasACargo;
        this.presupuesto = presupuesto;
        this.frecuenciaReuniones = frecuenciaReuniones;
    }
    
    @Override
    public void trabajar(){
        System.out.println(nombre+" esta coordinando el equipo del departamento de "+departamento+" ("+personasACargo+" personas a cargo).");
    }

    @Override
    public void evaluarDesempeno(String nombreEmpleado) {
        System.out.println(nombre+"-Gerente- esta evaluando el desempeño de "+nombreEmpleado+" en el departamento de "+departamento+".");
    }
    
    @Override
    public String toString(){
        return " -GERENTE- "+super.toString()+
                " Departamento: "+departamento+
                " A cargo: "+personasACargo+
                " Presupuesto: $"+presupuesto+
                " Reuniones: "+frecuenciaReuniones;
    }
    
}