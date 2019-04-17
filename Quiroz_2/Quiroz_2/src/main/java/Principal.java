import java.util.*;
import java.lang.*;
public class Principal {
    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione opción");
        System.out.println();
        System.out.println("Ver pedidos");
        System.out.println("Generar pedido");
        System.out.println("Modificar pedido");
        System.out.println("Eliminar pedido");
        System.out.println("Salir");
        try{
        int opcion = sc.nextInt();
        opcion(opcion);
        }catch(Exception e){
        System.out.println("opcion mal ingresada");
        menu();
        }
    }
    
    public void opcion(int opcion){
       
        switch(opcion){
            case 1:
               verPedidos(pedidos);
               menu();
                break;
            case 2:
                generarPedido();
                menu();
                break;
            case 3:
                modificarPedido();
                menu();
                break;
            case 4:
                eliminarPedido();
                menu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("opcion mal ingresada");
                menu();
                break;
        }
        
        }
    
    
    public void verPedidos(ArrayList<Pedido> pedidos){
    System.out.println(pedidos);
    }
    
    public void generarPedido(){
         Pedido pedido = new Pedido();
         pedidos.add(pedido); // esta malo
         System.out.println("Pedido generado");
    }
    
    public void modificarPedido(){
    System.out.println("Ingrese opción");
    System.out.println();
    System.out.println("Agregar Polera");
    System.out.println("Eliminar Polera");
    Scanner sc = new Scanner(System.in);
    int opcion = sc.nextInt();
    switch(opcion){
        case 1:
            crearPolera();
            agregarPolera();
            modificarPedido();
            break;
        case 2:
            eliminarPolera();
            modificarPedido();
            
    }
    }
    public void crearPolera(){
    
    }
    public void agregarPolera(){
        
    }
    public void eliminarPolera(){
        
    }
    
    public void eliminarPedido(){
        
    }
}
