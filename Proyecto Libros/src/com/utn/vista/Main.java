package com.utn.vista;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

import javax.swing.JOptionPane;

public class Main {

	static ObjectOutputStream entradaDatos = null;
	static Libro libro = null;
	public static void main(String[] args) {
		String nombre;
		String nombreAutor;
		String genero;
		int cantPag;
		String cantPagS;
		int SiNoCargaDatos;
		Path carpetaLibros = Paths.get("C:\\Users\\Java\\eclipse-workspace\\Leer Archivo .csv\\DatosLibros.csv");
		int cargaDatos = JOptionPane.showConfirmDialog(null, "¿Desea cargar datos?");
		if (cargaDatos == 1){
			System.out.println("OK");
		}else {
			try {
				entradaDatos = new ObjectOutputStream(Files.newOutputStream(carpetaLibros, CREATE,APPEND));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			do {	
				nombre = JOptionPane.showInputDialog("Ingrese el nombre del libro:");
				nombreAutor = JOptionPane.showInputDialog("Ingrese el nombre del autor:");
				genero = JOptionPane.showInputDialog("Ingrese el genero del libro:");
				cantPagS = JOptionPane.showInputDialog("Ingrese la cantidad de paginas del libro:");
				cantPag = Integer.parseInt(cantPagS);
				libro = new Libro (nombre,nombreAutor,genero,cantPag);
				cargarLibro ();
				SiNoCargaDatos = JOptionPane.showConfirmDialog(null, "¿Desea cargar otro libro?");
			}while (SiNoCargaDatos == 0);
			System.out.println("si");
		}
		
	}

	public static void cargarLibro() {
		try {
			entradaDatos.writeObject(libro);
			entradaDatos.reset();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
