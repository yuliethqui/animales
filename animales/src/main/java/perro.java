/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EIT
 */


public class perro extends seleccion_animal
{
	private final String marca_croquetas;
        public perro(String nombre, String raza, String color, String tamano, String marca_croquetas)
        {
            super(nombre, raza, color, tamano);
            this.marca_croquetas=marca_croquetas;
        }
	public void imprimeMarcaCroquetas()
	{
            System.out.println("La marca de croquetas son: "+marca_croquetas);
	}
}
