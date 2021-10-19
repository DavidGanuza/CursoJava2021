package es.com.inetum.elementos.modelo;

public class Tijera extends ElementoFactory {

	public Tijera() {
		super("Tijera", 2);
	}

	@Override
	public int comparar(ElementoFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == PAPEL) {
			resultado = 1;
			descripcionResultado = "Tijera gana a Papel";
		}else if (numero == LAGARTO) {
			resultado = 1;
			descripcionResultado = "Tijera gana a Lagarto";
		}else if (numero == PIEDRA) {
			resultado = -1;
			descripcionResultado = "Tijera pierde con Piedra";
		}else if (numero == SPOCK) {
			resultado = -1;
			descripcionResultado = "Tijera pierde con Spock";
		}else {
			resultado = 0;
			descripcionResultado = "Empate";
		}
		
		return resultado;
	}
}
