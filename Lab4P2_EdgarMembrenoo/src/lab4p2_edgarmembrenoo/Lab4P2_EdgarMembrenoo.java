/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_edgarmembrenoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edgarmembreno
 */
public class Lab4P2_EdgarMembrenoo {
static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ArrayList<Empleados> datos = new ArrayList();
        ArrayList<proyectos> proye = new ArrayList();
        System.out.println("*****Login****");
        System.out.println("Ingrese Un usuario: ");
        String usua = leer.next();
        System.out.println("Ingrese Contraseña: ");
        String contra = leer.next();
        if (usua.equals("admin") && contra.equals("1234")) {
            int opcion = 0;
            while (opcion != 3) {
                System.out.println("MENU\n"
                        + "1.Agregar Empleado\n"
                        + "2.Login del sistema\n"
                        + "3.Creacion de proyecto\n"
                        + "4.Salir del programa");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1: {
                        System.out.println("Ingrese que tipo de empleado desea Agregar 1.Desarollador//2.Director//3.Consultor//4.Empleado Regular");
                        int emple = leer.nextInt();
                        if (emple == 1) {
                            System.out.println("Ingrese su nombre: ");
                            String nombre = leer.next();
                            System.out.println("Ingrese su apellido: ");
                            String apellido = leer.next();
                            System.out.println("Ingrese su identidad: ");
                            int identi = leer.nextInt();
                            System.out.println("Ingrese su nacionalidad: ");
                            String nacio = leer.next();
                            System.out.println("Ingrese el nombre del usuario que desea: ");
                            String user = leer.next();
                            System.out.println("Ingrese la contraseña que desee: ");
                            int pass = leer.nextInt();
                            System.out.println("Ingrese Cantidad de proyectos realizados: ");
                            int proreal = leer.nextInt();
                            System.out.println("Ingrese la Cantidad de proyectos asignados: ");
                            int proAsi = leer.nextInt();
                            System.out.println("Ingrese los años de experiencia que tiene: ");
                            int aExperiencia = leer.nextInt();
                            System.out.println("Ingrese la cantidad de años de su contrato: ");
                            int cantAño = leer.nextInt();
                            System.out.println("Ingrese su lenguaje de programacion preferido: ");
                            String lengua = leer.next();
                            System.out.println("Ingrese las horas trabajadas diarias: ");
                            int hordia = leer.nextInt();

                            System.out.println("Ingrese su sueldo mensual: ");
                            Double suel = leer.nextDouble();

                            Empleados f = new Desarolladores();

                            System.out.println(((Desarolladores) f).formu());

                            for (int i = 0; i < datos.size(); i++) {
                                datos.add(new Desarolladores(proreal, proAsi, aExperiencia, cantAño, lengua, hordia, suel, nombre, apellido, identi, nacio, pass, user, hordia));
                            }
                        } else if (emple == 2) {
                            ArrayList<String> desa = new ArrayList<String>();
                            ArrayList<String> consul = new ArrayList<String>();
                            System.out.println("Ingrese su nombre: ");
                            String nombre = leer.next();
                            System.out.println("Ingrese su apellido: ");
                            String apellido = leer.next();
                            System.out.println("Ingrese su identidad: ");
                            int identi = leer.nextInt();
                            System.out.println("Ingrese su nacionalidad: ");
                            String nacio = leer.next();
                            System.out.println("Ingrese el nombre del usuario que desea: ");
                            String user = leer.next();
                            System.out.println("Ingrese la contraseña que desee: ");
                            int pass = leer.nextInt();
                            System.out.println("Ingrese los años que ha estado en su puesto: ");
                            int aPuesto = leer.nextInt();
                            System.out.println("Ingrese los años de su contato: ");
                            int contrato = leer.nextInt();
                            System.out.println("Ingrese los desarolladores que le asignaron: ");
                            String deAsig = leer.next();
                            desa.add(deAsig);
                            System.out.println("Ingrese los consultores que le asignaron: ");
                            String consultores = leer.next();
                            desa.add(consultores);
                            System.out.println("Ingrese la cantidad de proyectos asignados: ");
                            int proasig = leer.nextInt();
                            System.out.println("Ingrese la cantidad de proyectos terminados: ");
                            int proTermi = leer.nextInt();
                            System.out.println("Ingrese su sueldo : ");
                            Double suel = leer.nextDouble();
                            for (int i = 0; i < datos.size(); i++) {
                                datos.add(new Directores(aPuesto, contrato, desa, consul, proasig, proTermi, suel, nombre, apellido, identi, nacio, pass, user, contrato));
                            }

                        } else if (emple == 3) {
                            System.out.println("Ingrese su nombre: ");
                            String nombre = leer.next();
                            System.out.println("Ingrese su apellido: ");
                            String apellido = leer.next();
                            System.out.println("Ingrese su identidad: ");
                            int identi = leer.nextInt();
                            System.out.println("Ingrese su nacionalidad: ");
                            String nacio = leer.next();
                            System.out.println("Ingrese el nombre del usuario que desea: ");
                            String user = leer.next();
                            System.out.println("Ingrese la contraseña que desee: ");
                            int pass = leer.nextInt();

                            System.out.println("Ingrese la cantidad de proyectos asignados: ");
                            int proAsign = leer.nextInt();
                            System.out.println("Ingrese la cantidad de proyectos terminados: ");
                            int proTermi = leer.nextInt();
                            System.out.println("Ingrese la cantidad de años de su contrato : ");
                            int aContra = leer.nextInt();
                            System.out.println("Ingrese su campo de experiencia: ");
                            String campexperiencia = leer.next();
                            System.out.println("Ingrese el tiempo trabajado: ");
                            int tiempo = leer.nextInt();
                            System.out.println("Ingrese su sueldo: ");
                            Double suel = leer.nextDouble();
                            for (int i = 0; i < datos.size(); i++) {
                                datos.add(new Consultores(proTermi, proAsign, aContra, campexperiencia, tiempo, suel, nombre, apellido, identi, nacio, pass, user, aContra));
                            }

                        } else if (emple == 4) {
                            System.out.println("Ingrese su nombre: ");
                            String nombre = leer.next();
                            System.out.println("Ingrese su apellido: ");
                            String apellido = leer.next();
                            System.out.println("Ingrese su identidad: ");
                            int identi = leer.nextInt();
                            System.out.println("Ingrese su nacionalidad: ");
                            String nacio = leer.next();
                            System.out.println("Ingrese el nombre del usuario que desea: ");
                            String user = leer.next();
                            System.out.println("Ingrese la contraseña que desee: ");
                            int pass = leer.nextInt();
                            System.out.println("Ingrese los años de su Contrato: ");
                            int aContra = leer.nextInt();

                            for (int i = 0; i < datos.size(); i++) {
                                datos.add(new Empleados(nombre, apellido, identi, nacio, pass, user, aContra));
                            }

                        }

                        break;
                    }

                    case 2: {
                        System.out.println("Ingrese Un usuario: ");
                        String user = leer.next();
                        System.out.println("Ingrese Contraseña: ");
                        String pass = leer.next();
                        for (int i = 0; i < datos.size(); i++) {
                            if (datos.get(i).getUser().equals(user) && datos.get(i).getUser() == pass) {
                                if (datos.get(i) instanceof Directores) {
                                    opcion = 0;
                                    while (opcion != 5) {
                                        System.out.println("MENU Directores\n"
                                                + "1.Crear Desarolladores \n"
                                                + "2.Crear Consultores \n"
                                                + "3.Modificar Desarolladores\n"
                                                + "4.Modificadores Consultores\n"
                                                + "5.Eliminar Desarolladores\n"
                                                + "6.Eliminar Consultores\n"
                                                + "7.Proyectos asignados de Desarolladores\n"
                                                + "8.Proyectos asignados de Consultadores\n "
                                                + "5.Salir");
                                        opcion = leer.nextInt();
                                        switch (opcion) {
                                        }
                                    }

                                } else if (datos.get(i) instanceof Consultores) {
                                    opcion = 0;
                                    while (opcion != 5) {
                                        System.out.println("MENU Consultores\n"
                                                + "1.Ver su Informacion \n"
                                                + "2.Modificar su info \n"
                                                + "3.Eliminar Cuenta \n"
                                                + "4.Cantidad de proyectos\n"
                                                + "5.Salir");
                                        opcion = leer.nextInt();
                                        switch (opcion) {
                                            case 1: {
                                                System.out.println(datos.get(i));

                                                break;

                                            }
                                            case 2: {
                                                System.out.println("Ingrese el numero de identificacion del usuario que quiere modificar : ");
                                                int nume = leer.nextInt();
                                                for (int j = 0; j < datos.size(); j++) {
                                                    if (nume == datos.get(i).getID()) {
                                                        while (opcion != 13) {
                                                            System.out.println("Que quiere modficar: \n"
                                                                    + "1.Nombre\n"
                                                                    + "2.Apellido\n"
                                                                    + "4.Nacionalidad: \n"
                                                                    + "5.Contraseña: \n"
                                                                    + "6.Usuario\n"
                                                                    + "7.Cantidad de Proyectos terminados\n"
                                                                    + "8.Cantidad proyectos asignados\n"
                                                                    + "9.Años contratados \n"
                                                                    + "10.Campo de experiencia\n"
                                                                    + "11.Tiempo trabajando \n"
                                                                    + "12. Sueldo "
                                                                    + "13.Salir de modificar");
                                                            opcion = leer.nextInt();
                                                            switch (opcion) {
                                                                case 1: {
                                                                    System.out.println("Ingrese su nombre: ");
                                                                    String nombre = leer.next();
                                                                    ((Consultores) datos.get(i)).setNombre(nombre);
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    System.out.println("Ingrese su apellido: ");
                                                                    String apellido = leer.next();
                                                                    ((Consultores) datos.get(i)).setApellido(apellido);
                                                                    break;

                                                                }
                                                                case 4: {
                                                                    System.out.println("Ingrese su nacionalidad: ");
                                                                    String nacio = leer.next();
                                                                    ((Consultores) datos.get(i)).setNacionalidad(nacio);
                                                                    break;

                                                                }
                                                                case 5: {
                                                                    System.out.println("Ingrese la contraseña que desee: ");
                                                                    int pas = leer.nextInt();
                                                                    ((Consultores) datos.get(i)).setPass(pas);
                                                                    break;

                                                                }
                                                                case 6: {
                                                                    System.out.println("Ingrese el nombre del usuario que desea: ");
                                                                    String us = leer.next();
                                                                    ((Consultores) datos.get(i)).setUser(us);
                                                                    break;

                                                                }
                                                                case 7: {
                                                                    System.out.println("Ingrese la cantidad de proyectos terminados: ");
                                                                    int proTermi = leer.nextInt();
                                                                    ((Consultores) datos.get(i)).setCantProy(proTermi);

                                                                    break;

                                                                }
                                                                case 8: {
                                                                    System.out.println("Ingrese la cantidad de proyectos asignados: ");
                                                                    int proAsign = leer.nextInt();
                                                                    ((Consultores) datos.get(i)).setCantProyAsig(proAsign);

                                                                    break;
                                                                }
                                                                case 9: {
                                                                    System.out.println("Ingrese la cantidad de años de su contrato : ");
                                                                    int aContra = leer.nextInt();
                                                                    ((Consultores) datos.get(i)).setAñosContra(aContra);
                                                                    break;
                                                                }
                                                                case 10: {
                                                                    System.out.println("Ingrese su campo de experiencia: ");
                                                                    String campexperiencia = leer.next();
                                                                    ((Consultores) datos.get(i)).setCampoExpe(campexperiencia);
                                                                    break;

                                                                }
                                                                case 11: {
                                                                    System.out.println("Ingrese el tiempo trabajado: ");
                                                                    int tiempo = leer.nextInt();
                                                                    ((Consultores) datos.get(i)).setTiempo(tiempo);
                                                                    break;

                                                                }
                                                                case 12: {
                                                                    System.out.println("Ingrese su sueldo: ");
                                                                    Double suel = leer.nextDouble();
                                                                    ((Consultores) datos.get(i)).setSueldo(suel);
                                                                    break;

                                                                }
                                                            }

                                                        }

                                                    }

                                                }

                                            }
                                            case 3: {
                                                datos.remove(i);

                                                break;

                                            }
                                            case 4: {

                                                for (int j = 0; j < proye.size(); j++) {
                                                    if (proye.get(i).getConsul().equals(datos.get(i).getNombre())) {
                                                        System.out.println(proye.get(i));
                                                    }
                                                }
                                                for (int j = 0; j < proye.size(); j++) {
                                                    if (proye.get(i).getConsul().equals(datos.get(i).getNombre())) {
                                                        System.out.println(proye.get(i).getDescripProyec());
                                                    }
                                                }

                                                break;

                                            }
                                        }
                                    }

                                } else if (datos.get(i) instanceof Desarolladores) {
                                    opcion = 0;
                                    while (opcion != 4) {
                                        System.out.println("MENU Desarollador\n"
                                                + "1.Ver su Informacion \n"
                                                + "2.Eliminar su cuenta\n"
                                                + "3.Cantidad de proyectos\n"
                                                + "4.Salir");
                                        opcion = leer.nextInt();
                                        switch (opcion) {
                                            case 1: {
                                                System.out.println(datos.get(i));
                                                break;
                                            }
                                            case 2: {
                                                datos.remove(i);
                                                break;
                                            }
                                            case 3: {

                                                break;
                                            }

                                        }
                                    }

                                }

                            }
                        }

                        break;

                    }
                    case 3: {
                        ArrayList<String> Directores = new ArrayList<String>();
                        ArrayList<String> Desarolladores = new ArrayList<String>();
                        ArrayList<String> Consultadores = new ArrayList<String>();

                        System.out.println("Ingrese el nombre del proyecto ");
                        String nomPro = leer.next();
                        System.out.println("Ingrese el nombre de la empresa");
                        String nombEmpr = leer.next();
                        System.out.println("Ingrese la descripcion del proyecto :");
                        String desPro = leer.next();
                        System.out.println("Ingrese los años de duracion: ");
                        int aDura = leer.nextInt();
                        System.out.println("Ingrese el estado: 1.Iniciado  2.desarollo 3.Terminado");
                        String estado = leer.next();
                        if (estado.equals("1")) {
                            estado = "Iniciado";
                        }else if (estado.equals("2")) {
                            estado = "Desarollo";
                            
                        }else if (estado.equals("3")) {
                            estado = "Terminado";
                            
                        }else{
                            System.out.println("Ingrese una opcion valida");
                            estado = leer.next();
                        }

                        System.out.println("Ingrese los directres: ");
                        String directo = leer.next();
                        Directores.add(directo);
                        System.out.println("Ingrese los desarolladores: ");
                        String desa = leer.next();
                        Desarolladores.add(desa);
                        System.out.println("Ingrese los consultadores: ");
                        String consul = leer.next();
                        Consultadores.add(consul);

                        for (int i = 0; i < proye.size(); i++) {
                            proye.add(new proyectos(nomPro, nombEmpr, desPro, aDura, estado, Directores, datos, proye));
                        }

                    }

                }
            }
        }

    }
    
    
}
