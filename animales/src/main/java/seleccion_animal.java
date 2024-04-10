/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EIT
 */
public class seleccion_animal {
  protected String nombre, raza, color, tamano;
        private final String tipo;
        public seleccion_animal(String nombre, String raza, String color, String tamano)
        {
            this.nombre=nombre;
            this.raza=raza;
            this.color=color;
            this.tamano=tamano;
            this.tipo="Terrestre";
        }
	public void imprimeDatos()
	{
            System.out.println("El nombre es: "+nombre);
            System.out.println("La raza es: "+raza);
            System.out.println("El color es: "+color);
            System.out.println("El tamaño es: "+tamano);
            System.out.println("El tipo es: "+tipo);
	}  
}
