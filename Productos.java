/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.Serializable;

/**
 *
 * @author zoebe
 */
public abstract class Productos implements Serializable
{
    public final static long serialVersionUID=1L;
    public final static double IVA=0.16;
    private static int folio;
    private String id;
    private String nom;
    private double precio;
    private int exist;

    public Productos()
    {
    }

    public Productos(String nom, double precio, int exist)
    {
        ++folio;
        String s=String.valueOf(folio);
        for (int i = s.length(); i < 5; i++)
        {
            s="0"+s;
        }
        id=s;
        this.nom = nom;
        this.precio = precio;
        this.exist = exist;
    }

    public Productos(String id)
    {
        this.id = id;
    }
    

    /**
     * @return the folio
     */
    public static int getFolio()
    {
        return folio;
    }

    /**
     * @param aFolio the folio to set
     */
    public static void setFolio(int aFolio)
    {
        folio = aFolio;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    /**
     * @return the exist
     */
    public int getExist()
    {
        return exist;
    }

    /**
     * @param exist the exist to set
     */
    public void setExist(int exist)
    {
        this.exist = exist;
    }

    @Override
    public String toString()
    {
        return  id + "\t=" + nom + "\t=" + precio + "\t=" + exist ;
    }
    
    public abstract double calcIva(double monto);
     
}
