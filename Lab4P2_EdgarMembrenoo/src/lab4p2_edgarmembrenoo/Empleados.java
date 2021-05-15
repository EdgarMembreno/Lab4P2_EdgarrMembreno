/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_edgarmembrenoo;

/**
 *
 * @author edgarmembreno
 */
public class Empleados {
    public String nombre;
    public String apellido;
    public int ID;
    public String nacionalidad;
    public int pass;
    public String user;
    public int contra;

    public Empleados() {
    }

    public Empleados(String nombre, String apellido, int ID, String nacionalidad, int pass, String user, int contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.nacionalidad = nacionalidad;
        this.pass = pass;
        this.user = user;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getContra() {
        return contra;
    }

    public void setContra(int contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", nacionalidad=" + nacionalidad + ", pass=" + pass + ", user=" + user + ", contra=" + contra + '}';
    }

    public double formu() {
        return (12000*8)/2*contra;
    }
    
    
}
