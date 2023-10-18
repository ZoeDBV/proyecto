/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author zoebe
 */
public class Perecederos extends Productos implements Machote 
{
    private String fechacad;

    public Perecederos(String fechacad, String nom, double precio, int exist)
    {
        super(nom, precio, exist);
        this.fechacad = fechacad;
    }

    public Perecederos()
    {
    }

    /**
     * @return the fechacad
     */
    public String getFechacad()
    {
        return fechacad;
    }

    /**
     * @param fechacad the fechacad to set
     */
    public void setFechacad(String fechacad)
    {
        this.fechacad = fechacad;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\t" + fechacad + "\n";
    }

    @Override
    public double calcIva(double monto)
    {
        return 0;
    }

    @Override
    public void accion1()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int accion2(int x)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String accion3(double d, Object x)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
