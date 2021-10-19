package es.com.inetum.elementos.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoFactory {
	public static final int PIEDRA = 0;
	public static final int PAPEL = 1;
	public static final int TIJERA = 2;
	public static final int LAGARTO = 3;
	public static final int SPOCK = 4;
	// Atributos
	protected String descripcionResultado;
	private static List<ElementoFactory> elementos;
	protected String nombre;
	protected int numero;
	
	// Constructores
	public ElementoFactory(String pNombre, int pNumero) {
		nombre = pNombre;
		numero = pNumero;
	}
	 
	// Accesos (Getter y Setter)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescripcionResultado() {
		return descripcionResultado;
	}
	
	//Metodos de Negocio
	public boolean isMe(int pNum) {
		return numero==pNum;
	}
	public abstract int comparar(ElementoFactory pElem);
	
	public static ElementoFactory getInstance(int pNum) {
		elementos = new ArrayList<ElementoFactory>();
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		elementos.add(new Lagarto());
		elementos.add(new Spock());
		
		// Van a ir el resto de los elementos
		for (ElementoFactory elementoFactory : elementos) {
			if (elementoFactory.isMe(pNum)) {
				return elementoFactory;
			}
		}
		return null;
	}
}
