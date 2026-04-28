/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author hermi
 */
public class Persona {
    protected String nombre;//nombre de la persona
    protected int edad;//edad
    protected String dni;//documento identidad
    protected String direccion; //direccion
    protected String numero; //numero de contacto

    public Persona(String nombre, int edad, String dni, String direccion, String numero) {
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
        this.direccion=direccion;
        this.numero=numero;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getDni(){
        return dni;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getNumero(){
        return numero;
    }
    
    
    @Override
    public String toString() {
        return "Nombre: "+nombre+
                "Edad: "+edad+
                "DNI: "+dni+
                "Direccion:"+direccion+
                "Contacto"+numero;
    }
}
