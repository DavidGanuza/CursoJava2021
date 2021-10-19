package es.com.inetum.elementos.modelo;

public class Spock extends ElementoFactory {

	public Spock() {
		super("Spock", 4);
	}

	@Override
	public int comparar(ElementoFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == TIJERA) {
			resultado = 1;
			descripcionResultado = "Spock gana a Tijera";
		}else if (numero == PIEDRA) {
			resultado = 1;
			descripcionResultado = "Spock gana a Piedra";
		}else if (numero == PAPEL) {
			resultado = -1;
			descripcionResultado = "Spock pierde con Papel";
		}else if (numero == LAGARTO) {
			resultado = -1;
			descripcionResultado = "Spock pierde con Lagarto";
		}else {
			resultado = 0;
			descripcionResultado = "Empate";
		}
		
		return resultado;
	}

}
