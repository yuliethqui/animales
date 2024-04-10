/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author EIT
 */


import java.util.*;
public class herencia 
{

    private static String nombre;
    private static String raza;
    private static String color;
    private static String tamano;
    private static String marca_croquetas;
    private static String marca_arena;
    public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dame el nombre del perro: ");
        nombre= teclado.nextLine();
        System.out.println("Dame la raza del perro: ");
        raza= teclado.nextLine();
        System.out.println("Dame el color del perro: ");
        color= teclado.nextLine();
        System.out.println("Dame el tamaño del perro: ");
        tamano= teclado.nextLine();
        System.out.println("Dame la marca de croquetas del perro: ");
        marca_croquetas= teclado.nextLine();
        perro p=new perro(nombre, raza, color, tamano, marca_croquetas);
        p.imprimeDatos();
        p.imprimeMarcaCroquetas();
        System.out.println("Dame el nombre del gato: ");
        nombre= teclado.nextLine();
        System.out.println("Dame la raza del gato: ");
        raza= teclado.nextLine();
        System.out.println("Dame el color del gato: ");
        color= teclado.nextLine();
        System.out.println("Dame el tamaño del gato: ");
        tamano= teclado.nextLine();
        System.out.println("Dame la marca de arena del gato: ");
        marca_arena= teclado.nextLine();
        gato g=new gato(nombre, raza, color, tamano, marca_arena);
        g.imprimeDatos();
        g.imprimeMarcaArena();
    }

        // TODO code application logic here
    }
    

