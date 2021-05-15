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
public class proyectos {
    public String nombreProye;
    public String nombreEmpresa;
    public String descripProyec;
    public int añosDura;
    public String estado;
    public ArrayList direEncar;
    public ArrayList desatolla;
    public ArrayList consul;

    public proyectos() {

    }

    public proyectos(String nombreProye, String nombreEmpresa, String descripProyec, int añosDura, String estado, ArrayList direEncar, ArrayList desatolla, ArrayList consul) {
        this.nombreProye = nombreProye;
        this.nombreEmpresa = nombreEmpresa;
        this.descripProyec = descripProyec;
        this.añosDura = añosDura;
        this.estado = estado;
        this.direEncar = direEncar;
        this.desatolla = desatolla;
        this.consul = consul;
    }

    public String getNombreProye() {
        return nombreProye;
    }

    public void setNombreProye(String nombreProye) {
        this.nombreProye = nombreProye;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripProyec() {
        return descripProyec;
    }

    public void setDescripProyec(String descripProyec) {
        this.descripProyec = descripProyec;
    }

    public int getAñosDura() {
        return añosDura;
    }

    public void setAñosDura(int añosDura) {
        this.añosDura = añosDura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList getDireEncar() {
        return direEncar;
    }

    public void setDireEncar(ArrayList direEncar) throws EX {
        if (direEncar.size() <= 2) {
            this.direEncar = direEncar;
        }else{
             throw new EX("No pueden haber mas de  2 Directores ");
        }

    }

    public ArrayList getDesatolla() {
        return desatolla;
    }

    public void setDesatolla(ArrayList desatolla)throws EX {
        if (desatolla.size() <= 5) {
            this.desatolla = desatolla;
        }else{
             throw new EX("No pueden haber mas de 5 Desarolladores ");
        }

    }

    public ArrayList getConsul() {
        return consul;
    }

    public void setConsul(ArrayList consul) throws EX{
        if (consul.size() < +3) {
            this.consul = consul;
        }else {
            throw new EX("No pueden haber mas de 3 consultores ");
        }

        
    }

    @Override
    public String toString() {
        return "proyectos{" + "nombreProye=" + nombreProye + ", nombreEmpresa=" + nombreEmpresa + ", descripProyec=" + descripProyec + ", a\u00f1osDura=" + añosDura + ", estado=" + estado + ", direEncar=" + direEncar + ", desatolla=" + desatolla + ", consul=" + consul + '}';
    }
    
}
