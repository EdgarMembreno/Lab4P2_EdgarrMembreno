/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_edgarmembrenoo;

import java.util.ArrayList;

/**
 *
 * @author edgarmembreno
 */
public class Directores extends Empleados{
    public int añosPuesto;
    public int añosContra;
    public ArrayList desarro;
    public ArrayList consul;
    public int cantProAsig;
    public int cantProj;
    public double sueldo;

    public Directores() {
        super();
    }

    public Directores(int añosPuesto, int añosContra, ArrayList desarro, ArrayList consul, int cantProAsig, int cantProj, double sueldo, String nombre, String apellido, int ID, String nacionalidad, int pass, String user, int contra) {
        super(nombre, apellido, ID, nacionalidad, pass, user, contra);
        this.añosPuesto = añosPuesto;
        this.añosContra = añosContra;
        this.desarro = desarro;
        this.consul = consul;
        this.cantProAsig = cantProAsig;
        this.cantProj = cantProj;
        this.sueldo = sueldo;
    }

    public int getAñosPuesto() {
        return añosPuesto;
    }

    public void setAñosPuesto(int añosPuesto) {
        this.añosPuesto = añosPuesto;
    }

    public int getAñosContra() {
        return añosContra;
    }

    public void setAñosContra(int añosContra) {
        this.añosContra = añosContra;
    }

    public ArrayList getDesarro() {
        return desarro;
    }

    public void setDesarro(ArrayList desarro) {
        this.desarro = desarro;
    }

    public ArrayList getConsul() {
        return consul;
    }

    public void setConsul(ArrayList consul) {
        this.consul = consul;
    }

    public int getCantProAsig() {
        return cantProAsig;
    }

    public void setCantProAsig(int cantProAsig) {
        this.cantProAsig = cantProAsig;
    }

    public int getCantProj() {
        return cantProj;
    }

    public void setCantProj(int cantProj) {
        this.cantProj = cantProj;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = formu();
    }

    @Override
    public String toString() {
        return super.toString()+"Directores{" + "a\u00f1osPuesto=" + añosPuesto + ", a\u00f1osContra=" + añosContra + ", desarro=" + desarro + ", consul=" + consul + ", cantProAsig=" + cantProAsig + ", cantProj=" + cantProj + ", sueldo=" + sueldo + '}';
    }
    
    
    
    public double formu(){
        return ((cantProj*cantProAsig*consul.size()*desarro.size()*5.23)/(cantProAsig *añosContra*2.28));
    }
    
    
}
