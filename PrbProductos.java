/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author zoebe
 */
public class PrbProductos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String mnu[]={"Perecederos","No Perecederos",
                    "Consulta Gen","Presupuestos de productos","Salir"};
        String mnu2[]={"Altas","Bajas","Consultas",
                    "Modificaciones","Regresar"};
        int opc,opc2;
        Productos p[]=null;
        try
        {
            Productos.setFolio((Integer)ManipulacionArchivos.carga("folios.dat"));
        } catch (Exception e)
        {
            Productos.setFolio(0);
        }
        p=(Productos[]) ManipulacionArchivos.cargaArr("Productos.dat");
        do
        {
            opc=Manipulacion.pintamenu(mnu,"Principal");
            switch (opc)
            {
                case 1:
                case 2:
                    do
                    {
                        opc2=Manipulacion.pintamenu(mnu2,mnu[opc-1]);
                        switch (opc2)
                        {
                            case 1:
                                p=Manipulacion.inserta(p, Manipulacion.creaobj(opc));
                                break;
                            case 2:
                                System.out.println("en construccion");
                                break;
                            case 3:
                                System.out.println(Manipulacion.consulta(p, opc, mnu));
                                break;
                            case 4:
                                System.out.println("en construccion");
                                break;
                            case 5:
                                System.out.println("en construccion");
                                break;
                            default:
                                System.out.println("opcion incorrecta");;
                        }
                    } while (opc2!=mnu2.length);
                    break;
                case 3:
                    System.out.println(Manipulacion.consultagen(p));
                    break;
                case 4:
                    Manipulacion.calPresupuesto(p);
                    break;
                case 5:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("opcion incorrecta");;
            }
        } while (opc!=mnu.length);
        ManipulacionArchivos.guarda(p, "Productos.dat");
        ManipulacionArchivos.guarda(Productos.getFolio(), "folios.dat");
    }
    
}
