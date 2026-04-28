/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author hermi
 */
public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    private String nivelDominio;
    private String herramientas;
    private int cantidadProyectos;

    public Desarrollador(String nombre, int edad, String dni, String direccion, String numero, double salario, String idEmpleado, String fechaContratacion, String tipoContrato, String area, String lenguajePrincipal, String nivelDominio, String herramientas, int cantidadProyectos){
        super(nombre, edad, dni, direccion, numero,
              salario, idEmpleado, fechaContratacion, tipoContrato, area);
        this.lenguajePrincipal = lenguajePrincipal;
        this.nivelDominio = nivelDominio;
        this.herramientas = herramientas;
        this.cantidadProyectos = cantidadProyectos;
    }

    public String getLenguajePrincipal(){
        return lenguajePrincipal;
    }

    public String getNivelDominio(){
        return nivelDominio;
    }

    public String getHerramientas(){
        return herramientas;
    }

    public int getCantidadProyectos(){
        return cantidadProyectos;
    }
    
    @Override
    public void trabajar(){
        System.out.println(nombre+" esta escribiendo codigo en "+lenguajePrincipal+" usando "+herramientas+".");
    }
    
    @Override
    public String toString(){
        return "- Desarrollador -: "+super.toString()+
                "Lenguaje: "+lenguajePrincipal+
                "Nivel:"+nivelDominio+
                "Herramientas: "+herramientas+
                "Proyectos: "+cantidadProyectos;
    }
    
    
    
}
