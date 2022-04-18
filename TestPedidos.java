public class TestPedidos{
    public static void main(String[] args) {

        Articulo articulo1= new Articulo();
        Articulo articulo2= new Articulo();
        Articulo articulo3= new Articulo();
        Articulo articulo4= new Articulo();

        articulo1.nombre = "moka";
        articulo1.precio = 1.5;
        articulo2.nombre = "latte";
        articulo2.precio = 2.5;
        articulo3.nombre = "café de goteo";
        articulo3.precio = 3.5;
        articulo4.nombre = "capuchino";
        articulo4.precio = 4.5;

        Pedido pedido1= new Pedido();
        Pedido pedido2= new Pedido();
        Pedido pedido3= new Pedido();
        Pedido pedido4= new Pedido();

        pedido1.nombre ="Cindhuri";
        pedido2.nombre ="Jimmy";
        pedido3.nombre ="Noah";
        pedido4.nombre ="Sam";

        System.out.println(pedido1);

        //No deberia imprimir nada
        System.out.println(pedido1.total);

        pedido2.items.add (articulo1);
        pedido2.total+=articulo1.precio;


        pedido3.items.add (articulo4);
        pedido3.total +=articulo4.precio;

        pedido4.items.add (articulo2);
        pedido4.total+=articulo2.precio;

        pedido1.listo=true;

        pedido4.items.add(articulo2);
        pedido4.items.add(articulo2);

        pedido4.total+=(articulo2.precio*2);

        pedido2.listo = true;


        System.out.printf("Nombre: %s\n", pedido1.nombre);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.listo);

        System.out.printf("Nombre: %s\n", pedido2.nombre);
        System.out.printf("Total: %s\n", pedido2.total);
        System.out.printf("Listo: %s\n", pedido2.listo);

        System.out.printf("Nombre: %s\n", pedido3.nombre);
        System.out.printf("Total: %s\n", pedido3.total);
        System.out.printf("Listo: %s\n", pedido3.listo);

        System.out.printf("Nombre: %s\n", pedido4.nombre);
        System.out.printf("Total: %s\n", pedido4.total);
        System.out.printf("Listo: %s\n", pedido4.listo);
    }
}