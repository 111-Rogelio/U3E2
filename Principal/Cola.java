import java.util.Scanner;

Cola de clase pública {
    public static void main (String [] args) {
      Colaproceso lis = nuevo Colaproceso ();  
     int opc2 = 0;
     int opc;
     Lector de escáner = nuevo escáner (System.in);
       hacer{ 
        System.out.println ("\ n ------- Menú ------");
        System.out.println ("1. Insertar dato");
        System.out.println ("2. Leer lista");
        System.out.println ("4. Borrar elemento de la lista o lista completa");
        System.out.println ("5. Salir del programa");
        System.out.println ("¿Que desea realizar?");
        opc = lector.nextInt ();
        cambiar (opc) {
            caso 1:
            Elemento de cadena;
            Scanner Lector = nuevo escáner (System.in);
            System.out.println ("inserte un elemento");
            elemento = Lector.nextLine ();
            lis.insertar (elemento);
            romper;
            caso 2:
            lis.Mostrar ();
            romper;
            caso 3:
            lis.eliminar ();
            romper;
            caso 5: System.exit (0); break;
            predeterminado: System.out.println ("No existe esa opcion, por favor intente de nuevo");
        }
        
          System.out.println ("\ n¿Desea realizar otro proceso? Presione 1 = SI 2 = NO");
       opc2 = lector.nextInt ();
       } while (opc2! = 2); 
    }
    
}
