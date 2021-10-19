package es.com.inetum.elementos.modelo;

public class Papel extends ElementoFactory {

	public Papel() {
		super("Papel", 1);
	}

	@Override
	public int comparar(ElementoFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == PIEDRA) {
			resultado = 1;
			descripcionResultado = "Papel gana a Piedra";
		}else if (numero == SPOCK) {
			resultado = 1;
			descripcionResultado = "Papel gana a Spock";
		}else if (numero == TIJERA) {
			resultado = -1;
			descripcionResultado = "Papel pierde con Tijera";
		}else if (numero == LAGARTO) {
			resultado = -1;
			descripcionResultado = "Papel pierde con Lagarto";
		} else {
			resultado = 0;
			descripcionResultado = "Empate";
		}
		
		return resultado;
	}
}
