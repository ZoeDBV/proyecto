/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author zoebe
 */
public class NoPercederos extends Productos implements Machote
{
    private int lote;

    public NoPercederos()
    {
    }

    public NoPercederos(int lote, String nom, double precio, int exist)
    {
        super(nom, precio, exist);
        this.lote = lote;
    }

    /**
     * @return the lote
     */
    public int getLote()
    {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(int lote)
    {
        this.lote = lote;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\t" + lote + "\n";
    }

    @Override
    public double calcIva(double monto)
    {
        return monto*Productos.IVA;
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
