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
public class Desarolladores extends Empleados {
     public int cantProReal;
    public int proyectosAsig;
    public int añosExperiencia;
    public int añosContrato;
    public String lengProFav;
    public int horTraDia;
    public double SuelMensu;

    public Desarolladores() {
        super();
    }

    public Desarolladores(int cantProReal, int proyectosAsig, int añosExperiencia, int añosContrato, String lengProFav, int horTraDia, double SuelMensu, String nombre, String apellido, int ID, String nacionalidad, int pass, String user, int contra) {
        super(nombre, apellido, ID, nacionalidad, pass, user, contra);
        this.cantProReal = cantProReal;
        this.proyectosAsig = proyectosAsig;
        this.añosExperiencia = añosExperiencia;
        this.añosContrato = añosContrato;
        this.lengProFav = lengProFav;
        this.horTraDia = horTraDia;
        this.SuelMensu = SuelMensu;
    }

    
    

    public int getCantProReal() {
        return cantProReal;
    }

    public void setCantProReal(int cantProReal) {
        this.cantProReal = cantProReal;
    }

    public int getProyectosAsig() {
        return proyectosAsig;
    }

    public void setProyectosAsig(int proyectosAsig) {
        this.proyectosAsig = proyectosAsig;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public int getAñosContrato() {
        return añosContrato;
    }

    public void setAñosContrato(int añosContrato) {
        this.añosContrato = añosContrato;
    }

    public String getLengProFav() {
        return lengProFav;
    }

    public void setLengProFav(String lengProFav) {
        this.lengProFav = lengProFav;
    }

    public int getHorTraDia() {
        return horTraDia;
    }

    public void setHorTraDia(int horTraDia) {
        this.horTraDia = horTraDia;
    }

    public double getSuelMensu() {
        return SuelMensu;
    }

    public void setSuelMensu(double SuelMensu) {
        this.SuelMensu = formu();
    }

    @Override
    public String toString() {
        return super.toString() + "Desarolladores{" + "cantProReal=" + cantProReal + ", proyectosAsig=" + proyectosAsig + ", a\u00f1osExperiencia=" + añosExperiencia + ", a\u00f1osContrato=" + añosContrato + ", lengProFav=" + lengProFav + ", horTraDia=" + horTraDia + ", SuelMensu=" + SuelMensu + '}';
    }

    public double formu() {
        return ((cantProReal * 115000 * 2) / proyectosAsig + añosContrato);
    }
}
