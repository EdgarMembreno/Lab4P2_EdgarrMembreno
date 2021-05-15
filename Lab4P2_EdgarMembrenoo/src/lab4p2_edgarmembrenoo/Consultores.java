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
public class Consultores extends Empleados{
    public int cantProy;
    public int cantProyAsig;
    public int añosContra;
    public String campoExpe;
    public int tiempo;
    public double sueldo;

    public Consultores() {
        super();
    }

    public Consultores(int cantProy, int cantProyAsig, int añosContra, String campoExpe, int tiempo, double sueldo, String nombre, String apellido, int ID, String nacionalidad, int pass, String user, int contra) {
        super(nombre, apellido, ID, nacionalidad, pass, user, contra);
        this.cantProy = cantProy;
        this.cantProyAsig = cantProyAsig;
        this.añosContra = añosContra;
        this.campoExpe = campoExpe;
        this.tiempo = tiempo;
        this.sueldo = sueldo;
    }

    

    public int getCantProy() {
        return cantProy;
    }

    public void setCantProy(int cantProy) {
        this.cantProy = cantProy;
    }

    public int getCantProyAsig() {
        return cantProyAsig;
    }

    public void setCantProyAsig(int cantProyAsig) {
        this.cantProyAsig = cantProyAsig;
    }

    public int getAñosContra() {
        return añosContra;
    }

    public void setAñosContra(int añosContra) {
        this.añosContra = añosContra;
    }

    public String getCampoExpe() {
        return campoExpe;
    }

    public void setCampoExpe(String campoExpe) {
        this.campoExpe = campoExpe;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = formu();
    }

    @Override
    public String toString() {
        return super.toString() + "Consultores{" + "cantProy=" + cantProy + ", cantProyAsig=" + cantProyAsig + ", a\u00f1osContra=" + añosContra + ", campoExpe=" + campoExpe + ", tiempo=" + tiempo + ", sueldo=" + sueldo + '}';
    }
    public double formu(){
        return (cantProy * 13280*4.13)/(cantProyAsig +añosContra);
    }
    
}
