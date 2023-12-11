package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pedirDatos =new Scanner(System.in);
        System.out.println(" bienvenido al sistema de pedidos a domicilio");
        System.out.println("para empezar ingrese el sabor de la pizza que quiere pedir, recuerde que tenemos 1. jamon 2. salami 3. hawaiana");
        String saborPizza= pedirDatos.nextLine();
        System.out.println("gracias por elegir su pizza sabor: "+ saborPizza + " ahora elegiremos el tamaño, recuerde que hay personal, familiar y mega");
        String tamanoPizza = pedirDatos.nextLine();
        System.out.println("cuantas unidades quieres de: "+ saborPizza+ " en tamaño: "+ tamanoPizza);
        short cantidadPizza= pedirDatos.nextShort();
        System.out.println("Pediste "+ cantidadPizza + "unidades");
        System.out.println("ingrese el valor de acuerdo a su eleccion de tamaño y sabor");
        System.out.println("precios jamon 1. 15000 2. 28000 3. 50000");
        System.out.println("precios salami 1. 19500 2. 32000 3. 56000");
        System.out.println("precios hawaiana 1. 16500 2. 29200 3. 52000");
        int precioPedido= pedirDatos.nextInt();
        System.out.println("su pedido es: "+ saborPizza + " tamano: "+ tamanoPizza+ " unidades: "+ cantidadPizza+" precio: "+ precioPedido);
        System.out.println(" su pedido esta listo, ahora necesitaremos los datos de envio: ");
        pedirDatos.nextLine();
        System.out.println("ingrese su nombre: ");
        String nombreCliente= pedirDatos.nextLine();
        System.out.println("señor "+ nombreCliente+ " ingrese la direccion: ");
        String direccionCliente= pedirDatos.nextLine();
        System.out.println("señor "+ nombreCliente+ " ingrese su telefono: ");
        String telefonoCliente= pedirDatos.nextLine();
        System.out.println("señor "+ nombreCliente+ " ingrese el metodo de pago: efectivo, transferencia ");
        String metodoPago= pedirDatos.nextLine();
        System.out.println("sus datos son, nombre:  "+ nombreCliente+ " direccion: "+ direccionCliente+" telefono: "+telefonoCliente+" metodo: "+metodoPago);


    }
}