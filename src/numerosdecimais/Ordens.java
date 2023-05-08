package numerosdecimais;

public class Ordens {
	public char unidade;
	public char dezena;
	public char centena;
	
	
	//MÉTODOS ESPECIAIS (ACESSORES E MODIFICADORES)
	
	//DEMAIS MÉTODOS
	
	public String ODUPorExtenso() {
		
		String numeroPorExtenso = "";
		
		switch(unidade) {
			case '0':
				numeroPorExtenso = "zero";
				break;
			case '1':
				numeroPorExtenso = "um";
				break;
			case '2':
				numeroPorExtenso = "dois";
				break;
			case '3':
				numeroPorExtenso = "três";
				break;
			case '4':
				numeroPorExtenso = "quatro";
				break;
			case '5':
				numeroPorExtenso = "cinco";
				break;
			case '6':
				numeroPorExtenso = "seis";
				break;
			case '7':
				numeroPorExtenso = "sete";
				break;
			case '8':
				numeroPorExtenso = "oito";
				break;
			case '9':
				numeroPorExtenso = "nove";
				break;
			default:
				
			}
		
		return numeroPorExtenso;

	}
	
	public String ODDPorExtenso() {
		
		String numeroPorExtenso = "";
		
		if(dezena == '1' && unidade != '0') {
			
			switch(unidade) {

			case '1':
				numeroPorExtenso = "onze";
				break;
			case '2':
				numeroPorExtenso = "doze";
				break;
			case '3':
				numeroPorExtenso = "treze";
				break;
			case '4':
				numeroPorExtenso = "quatorze";
				break;
			case '5':
				numeroPorExtenso = "quinze";
				break;
			case '6':
				numeroPorExtenso = "dezesseis";
				break;
			case '7':
				numeroPorExtenso = "dezessete";
				break;
			case '8':
				numeroPorExtenso = "dezoito";
				break;
			case '9':
				numeroPorExtenso = "dezenove";
				break;
			default:
				
			}
		} else {
		
		switch(dezena) {
			case '0':
				numeroPorExtenso = "";
				break;
		
			case '1':
				numeroPorExtenso = "dez";
				break;
			case '2':
				numeroPorExtenso = "vinte";
				break;
			case '3':
				numeroPorExtenso = "trinta";
				break;
			case '4':
				numeroPorExtenso = "quarenta";
				break;
			case '5':
				numeroPorExtenso = "cinquenta";
				break;
			case '6':
				numeroPorExtenso = "sessenta";
				break;
			case '7':
				numeroPorExtenso = "setenta";
				break;
			case '8':
				numeroPorExtenso = "oitenta";
				break;
			case '9':
				numeroPorExtenso = "noventa";
				break;
			default:
		
			}
		}
		return numeroPorExtenso ;
	}
	
	public String ODCPorExtenso() {
		
		String numeroPorExtenso = "";
		
		if(centena == '1' && dezena == '0' && unidade == '0') {
			numeroPorExtenso = "cem";
		} else
			
			switch(centena) {
			
				case '0':
					numeroPorExtenso = "";
					break;
				case '1':
					numeroPorExtenso = "cento";
					break;
				case '2':
					numeroPorExtenso = "duzentos";
					break;
				case '3':
					numeroPorExtenso = "trezentos";
					break;
				case '4':
					numeroPorExtenso = "quatrocentos";
					break;
				case '5':
					numeroPorExtenso = "quinhentos";
					break;
				case '6':
					numeroPorExtenso = "seissentos";
					break;
				case '7':
					numeroPorExtenso = "setessentos";
					break;
				case '8':
					numeroPorExtenso = "oitossentos";
					break;
				case '9':
					numeroPorExtenso = "novessentos";
					break;
				default:
					
				}
		return numeroPorExtenso;

	}
	
	
	
}
