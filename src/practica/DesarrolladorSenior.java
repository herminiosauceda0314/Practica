/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author hermi
 */
public class DesarrolladorSenior extends Desarrollador implements Evaluador, Capacitador {
    private int anosExperiencia;
    private int proyectosLiderados;
    private String nivelEspecializacion;
    private boolean capacidadMentoria;
    
 
    public DesarrolladorSenior(String nombre, int edad, String documentoIdentidad, String direccion, String numeroContacto, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String area, String lenguajePrincipal, String nivelDominio, String herramientas, int cantidadProyectos, int anosExperiencia, int proyectosLiderados, String nivelEspecializacion, boolean capacidadMentoria) {
        super(nombre, edad, documentoIdentidad, direccion, numeroContacto, salario, idEmpleado, fechaContratacion, tipoContrato, area, lenguajePrincipal, nivelDominio, herramientas, cantidadProyectos);
        this.anosExperiencia = anosExperiencia;
        this.proyectosLiderados = proyectosLiderados;
        this.nivelEspecializacion = nivelEspecializacion;
        this.capacidadMentoria = capacidadMentoria;
        
    }
    
    @Override
    public void trabajar() {
        System.out.println(nombre + " esta liderando proyectos, escribiendo codigo en " + getLenguajePrincipal() + " y mentoreando al equipo. " + "(" + anosExperiencia + " años de experiencia).");
    }
 
    @Override
    public void evaluarDesempeno(String nombreEmpleado) {
        System.out.println(nombre + " -Dev Senior- está evaluando el desempeño de " + nombreEmpleado + " con enfoque tecnico y de especializacion.");
    }
 
    @Override
    public void impartirCapacitacion(String tema) {
        System.out.println(nombre + " esta impartiendo una capacitacion sobre: \"" + tema + "\" (Especializacion: " + nivelEspecializacion + ").");
    }
 
    @Override
    public String toString() {
        return " -DEV SENIOR- " + super.toString() +
               " Experiencia: " + anosExperiencia + " años" +
               " Proyectos liderados: " + proyectosLiderados +
               " Especializacion: " + nivelEspecializacion +
               " Mentoría(Si/No): " + (capacidadMentoria ? "Sí" : "No");
    }
}

