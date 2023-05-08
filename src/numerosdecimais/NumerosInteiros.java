package numerosdecimais;

public class NumerosInteiros {
	
	
	public static String numerosPorExtenso(String num) {
		
		String resultado = "";
		
		Classes numeros = new Classes();
		
		
		if(num.length() < 9) {
			
			for(int i = num.length(); i < 9; i++ ) {
				num = 0 + num;
			}
			
			numeros.unidadeSimples = num.substring(6, 9);
			numeros.milhares = num.substring(3, 6);
			numeros.milhoes = num.substring(0, 3);
			
			if(numeros.unidadeSimples == "000" && numeros.milhares == "000" && numeros.milhoes == "000") {
				resultado = "Digite uma valor!";
			}
			else {
				resultado = numeros.CDMPorExtenso() + numeros.CDMLPorExtenso() + numeros.CDUSPorExtenso();
			}
			return resultado;
			
		}
		else {

			// REPETIÇÃO DE CÓDIGO
			numeros.unidadeSimples = num.substring(6, 9);
			numeros.milhares = num.substring(3, 6);
			numeros.milhoes = num.substring(0, 3);
			
			if(numeros.unidadeSimples == "000" && numeros.milhares == "000" && numeros.milhoes == "000") {
				resultado = "Digite uma valor!";
			}
			else {
				resultado = numeros.CDMPorExtenso() + numeros.CDMLPorExtenso() + numeros.CDUSPorExtenso();
			}
		}
		return resultado;
	}
}
