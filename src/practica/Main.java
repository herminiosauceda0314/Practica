/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hermi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Empleado> empleados = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n===== TECHCORP - MENU =====");
            System.out.println("1. Registrar Desarrollador");
            System.out.println("2. Registrar Gerente");
            System.out.println("3. Registrar Desarrollador Senior");
            System.out.println("4. Ver todos trabajando");
            System.out.println("5. Ver salarios");
            System.out.println("6. Informacion completa");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");             
                    String nombre =sc.nextLine();
                    
                    System.out.print("Edad: ");               
                    int edad =sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("DNI: ");                
                    String dni =sc.nextLine();
                    
                    System.out.print("Direccion: ");          
                    String direccion =sc.nextLine();
                    
                    System.out.print("Numero: ");             
                    String numero =sc.nextLine();
                    
                    System.out.print("Salario: ");          
                    double salario =sc.nextDouble(); 
                    sc.nextLine();
                    
                    System.out.print("ID Empleado: ");        
                    String id =sc.nextLine();
                    
                    System.out.print("Fecha contratacion: "); 
                    String fecha =sc.nextLine();
                    
                    System.out.print("Tipo contrato: ");      
                    String contrato =sc.nextLine();
                    
                    System.out.print("Area: ");               
                    String area =sc.nextLine();
                    
                    System.out.print("Lenguaje: ");           
                    String lenguaje =sc.nextLine();
                    
                    System.out.print("Nivel dominio: ");      
                    String nivel =sc.nextLine();
                    
                    System.out.print("Herramientas: ");       
                    String herramientas =sc.nextLine();
                    
                    System.out.print("Cantidad proyectos: "); 
                    int proyectos =sc.nextInt(); 
                    sc.nextLine();

                    empleados.add(new Desarrollador(nombre, edad, dni, direccion, numero, salario, id, fecha, contrato, area, lenguaje, nivel, herramientas, proyectos));
                    System.out.println("Desarrollador registrado.");
                    break;

                case 2:
                    System.out.print("Nombre: ");             
                    String nombre2 =sc.nextLine();
                    
                    System.out.print("Edad: ");               
                    int edad2 =sc.nextInt(); 
                    sc.nextLine();
                    
                    System.out.print("DNI: ");                
                    String dni2 =sc.nextLine();
                    
                    System.out.print("Direccion: ");          
                    String direccion2 =sc.nextLine();
                    
                    System.out.print("Numero: ");             
                    String numero2 =sc.nextLine();
                    
                    System.out.print("Salario: ");            
                    double salario2 =sc.nextDouble(); 
                    sc.nextLine();
                    
                    System.out.print("ID Empleado: ");        
                    String id2 =sc.nextLine();
                    
                    System.out.print("Fecha contratacion: "); 
                    String fecha2 =sc.nextLine();
                    
                    System.out.print("Tipo contrato: ");      
                    String contrato2 =sc.nextLine();
                    
                    System.out.print("Area: ");               
                    String area2 =sc.nextLine();
                    
                    System.out.print("Departamento: ");       
                    String depto = sc.nextLine();
                    
                    System.out.print("Personas a cargo: ");   
                    int personas = sc.nextInt(); 
                    sc.nextLine();
                    
                    System.out.print("Presupuesto: ");        
                    double presupuesto = sc.nextDouble(); 
                    sc.nextLine();
                    
                    System.out.print("Frecuencia reuniones: "); 
                    String reuniones = sc.nextLine();

                    empleados.add(new Gerente(nombre2, edad2, dni2, direccion2, numero2, salario2, id2, fecha2, contrato2, area2, depto, personas, presupuesto, reuniones));
                    System.out.println("Gerente registrado.");
                    break;

                case 3:
                    System.out.print("Nombre: ");             
                    String nombre3 = sc.nextLine();
                    
                    System.out.print("Edad: ");               
                    int edad3 = sc.nextInt(); 
                    sc.nextLine();
                    
                    System.out.print("DNI: ");                
                    String dni3 = sc.nextLine();
                    
                    System.out.print("Direccion: ");          
                    String direccion3 = sc.nextLine();
                    
                    System.out.print("Numero: ");             
                    String numero3 = sc.nextLine();
                    
                    System.out.print("Salario: ");            
                    double salario3 = sc.nextDouble(); 
                    sc.nextLine();
                    
                    System.out.print("ID Empleado: ");        
                    String id3 = sc.nextLine();
                    
                    System.out.print("Fecha contratacion: "); 
                    String fecha3 = sc.nextLine();
                    
                    System.out.print("Tipo contrato: ");      
                    String contrato3 = sc.nextLine();
                    
                    System.out.print("Area: ");              
                    String area3 = sc.nextLine();
                    
                    System.out.print("Lenguaje: ");           
                    String lenguaje3 = sc.nextLine();
                    
                    System.out.print("Nivel dominio: ");      
                    String nivel3 = sc.nextLine();
                    
                    System.out.print("Herramientas: ");       
                    String herramientas3 = sc.nextLine();
                    
                    System.out.print("Cantidad proyectos: "); 
                    int proyectos3 = sc.nextInt(); 
                    sc.nextLine();
                    
                    System.out.print("Años experiencia: ");   
                    int experiencia = sc.nextInt(); 
                    sc.nextLine();
                    
                    System.out.print("Proyectos liderados: "); 
                    int liderados = sc.nextInt(); 
                    sc.nextLine();
                    
                    System.out.print("Nivel especializacion: "); 
                    String especializacion = sc.nextLine();
                    
                    System.out.print("Capacidad mentoria (true/false): "); 
                    boolean mentoria = sc.nextBoolean(); sc.nextLine();

                    empleados.add(new DesarrolladorSenior(nombre3, edad3, dni3, direccion3, numero3, salario3, id3, fecha3, contrato3, area3, lenguaje3, nivel3, herramientas3, proyectos3, experiencia, liderados, especializacion, mentoria));
                    System.out.println("Desarrollador Senior registrado.");
                    break;

                case 4:
                    System.out.println("\n--- TODOS TRABAJANDO ---");
                    for (Empleado e : empleados) {
                        e.trabajar();
                    }
                    break;

                case 5:
                    System.out.println("\n--- SALARIOS ---");
                    for (Empleado e :empleados) {
                        System.out.println(e.getNombre() + " -> $" + e.getSalario());
                    }
                    break;

                case 6:
                    System.out.println("\n--- INFORMACION COMPLETA ---");
                    for (Empleado e :empleados) {
                        System.out.println(e);
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.err.println("Opcion invalida.");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
