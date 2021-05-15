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
public class EX  extends Exception{
    private String excep;

    public EX() {
        super();
    }

    public EX(String excep) {
        this.excep = excep;
    }

    public String getExcep() {
        return excep;
    }

    public void setExcep(String excep) {
        this.excep = excep;
    }

    @Override
    public String toString() {
        return super.toString()+"EX{" + "excep=" + excep + '}';
    }
    

}
