package es.com.inetum.elementos.modelo;

public class Piedra extends ElementoFactory {

	public Piedra() {
		super("Piedra", 0);
	}

	@Override
	public int comparar(ElementoFactory pElem) {
		int numero = pElem.getNumero();
		int resultado = 0;
		
		if (numero == TIJERA) {
			resultado = 1;
			descripcionResultado = "Piedra gana a Tijera";
		}else if (numero == LAGARTO) {
			resultado = 1;
			descripcionResultado = "Piedra gana a Lagarto";
		}else if (numero == PAPEL) {
			resultado = -1;
			descripcionResultado = "Piedra pierde con Papel";
		}else if (numero == SPOCK) {
			resultado = -1;
			descripcionResultado = "Piedra pierde con Spock";
		}else {
			resultado = 0;
			descripcionResultado = "Empate";
		}
		
		//switch (numero) {
		//case TIJERA: {
		//	resultado = 1
		//	break;
		//}
		//case PAPEL: {
		//	resultado = -1
		//	break;
		//}
		//default:
		//	reultado = 0;
		//}
		
		return resultado;
	}
}
