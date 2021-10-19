package es.com.inetum.elementos.modelo;

public class Lagarto extends ElementoFactory {

	public Lagarto() {
		super("Lagarto", 3);
	}

	@Override
	public int comparar(ElementoFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == PAPEL) {
			resultado = 1;
			descripcionResultado = "Lagarto gana a Papel";
		}else if (numero == SPOCK) {
			resultado = 1;
			descripcionResultado = "Lagarto gana a Spock";
		}else if (numero == PIEDRA) {
			resultado = -1;
			descripcionResultado = "Lagarto pierde con Piedra";
		}else if (numero == TIJERA) {
			resultado = -1;
			descripcionResultado = "Lagarto pierde con Tijera";
		}else {
			resultado = 0;
			descripcionResultado = "Empate";
		}
		
		return resultado;
	}

}
