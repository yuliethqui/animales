/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EIT
 */


public class gato extends seleccion_animal
{
	private final String marca_arena;
        public gato(String nombre, String raza, String color, String tamano, String marca_arena)
        {
            super(nombre, raza, color, tamano);
            this.marca_arena=marca_arena;
        }
        
	public void imprimeMarcaArena()
	{
            System.out.println("La marca de arena es: "+marca_arena);
        }
        }
