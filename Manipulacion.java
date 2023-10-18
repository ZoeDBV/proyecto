/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.ArrayList;
import poo8.Lecturas;

/**
 *
 * @author zoebe
 */
public class Manipulacion
{
    public static int pintamenu(String []mnu,String s)
    {
        System.out.println("===Menu"+s);
        for (int i = 0; i < mnu.length; i++)
        {
            System.out.println((i+1)+".-"+mnu[i]);
        }
        System.out.print("elige una opcion:");
        return Lecturas.leerentero();
    }
    public static Productos[]inserta(Productos[]p,Productos obj)
    {
        if (p==null)
        {
            p=new Productos[1];
        } else
        {
            Productos nvo[]=new Productos[p.length+1];
            System.arraycopy(p, 0, nvo, 0, p.length);
            p=nvo;
        }
        p[p.length-1]=obj;
        return p;
    }
    public static String consultagen(Productos p[])
    {
        String s=" ";
        try
        {
            s+="===Consulta General===\n";
            s+="id\tnom\tprecio\texist\tlote\\fechacad\n";
            for (int i = 0; i < p.length; i++)
            {
                s+=p[i].toString();
            }
        }catch (Exception e)
        {
            s="Error..no hay datos";
        }
        return s;
    }
    public static Productos creaobj(int opc)
    {
        String nom;
        double precio;
        int exist;
        int lote;
        String fechacad;
        
        System.out.print("dame el nombre del producto:");
        nom=Lecturas.leerCadena();
        System.out.print("dame el  precio:");
        precio=Lecturas.leerdoble();
        System.out.print("dame las existencias del producto:");
        exist=Lecturas.leerentero();
       
        if (opc==1)
        {
            System.out.println("Dame el producto ");
            fechacad=Lecturas.leerCadena();
            return new Perecederos(fechacad, nom, precio, exist);
        } else
        {
            System.out.println("Dame el lote del producto");
            lote=Lecturas.leerentero();
            return new NoPercederos(lote, nom, precio, exist);
        }
    }
    public static String consulta(Productos p[],int opc,String mnu[])
    {
        String s=" ";
        try
        {
            s+="===Consulta "+mnu[opc-1]+"===\n";
            if (opc==1)
            {
                s+="id\tnom\tprecio\texist\tlote\\fechacad\n";
            } else
            {
                s+="id\tnom\tprecio\texist\tlote\n";
            }
            
            for (int i = 0; i < p.length; i++)
            {
                if (opc==1 && p[i] instanceof Perecederos)
                {
                    s+=p[i].toString();
                } else
                {
                    if (opc==2 && p[i] instanceof NoPercederos)
                    {
                        s+=p[i].toString();
                    }
                }
            }
        }catch (Exception e)
        {
            s="Error..no hay datos";
        }
        return s;
    }

//    public static String Bajas(Productos p[],int opc,String mnu[],Productos obj)
//    {
//        String nom;
//        int elim ;
//        String s=" ";
//        int id;
//        try
//        {
//            s+="===Bajas"+mnu[opc-1]+"===\n";
//            System.out.println("Ingrese el id del producto que desea eliminar");
//            id=Lecturas.leerentero();
//            for (int i = 0; i < p.length; i++)
//            {
//                if (opc==1 && p[i] instanceof Perecederos)
//                {
//                    if (elim == id)
//                    {
//                        for (int j = 0; j < ; j++)
//                        {
//                            
//                        }
//                    }
//                    
//                } else
//                {
//                    if (opc==2 && p[i] instanceof NoPercederos)
//                    {
//                       
//                    }
//                }
//
//            }
//            
//        } catch (Exception e)
//        {
//            s="error no hay dato";
//        }
//        return s;
//    }
//    public static String Modificaciones(Productos p[],int opc,String mnu[],Productos obj)
//    {
//        String nom;
//        int elim = 0;
//        String s=" ";
//        try
//        {
//            s+="===Modificaciones"+mnu[opc-1]+"===\n";
//            System.out.println("Que producto desea modificar");
//            nom=Lecturas.leerCadena();
//            for (int i = 0; i < p.length; i++)
//            {
//                if (opc==1 && p[i] instanceof Perecederos)
//                {
//                   Perecederos<Class>per=new ArrayList<Class>();
//                   per.
//                } else
//                {
//                    if (opc==2 && p[i] instanceof NoPercederos)
//                    {
//                       NoPercederos<Class>nop=new ArrayList<Class>();
//                       nop
//                    }
//                }
//
//            }
//            
//        } catch (Exception e)
//        {
//            s="error no hay dato";
//        }
//        return s;
//    }
    public static void calPresupuesto(Productos p[])
    {
        if (p!=null)
        {
            System.out.print("dame le id del profducto a presupuestar");
            int pos=busca(p,Lecturas.leerCadena());
            if (pos==-1)
            {
                System.out.println("dato no encontrado");
            } else
            {
                System.out.println("dame la cantidad deseada:");
                int cant=Lecturas.leerentero();
                System.out.println("Producto="+p[pos].getNom());
                System.out.println("Precio="+p[pos].getPrecio());
                System.out.println("cantidad="+cant);
                double monto=cant*p[pos].getPrecio();
                System.out.println("Subtotal="+monto);
                double iva=p[pos].calcIva(monto);
                System.out.println("IVA="+iva);
                System.out.println("TOTAL="+(monto+iva));
                
            }
        } else
        {
            System.out.println("no hay productos...");
        }
    }
    private static int busca(Productos p[],String id)
    {
        for (int i = 0; i < p.length; i++)
        {
            if (p[i].getId().equals(id))
            {
                return i;
            } 
            
        }
        return -1;
    }
}
