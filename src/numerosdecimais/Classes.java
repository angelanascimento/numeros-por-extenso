package numerosdecimais;

public class Classes {
	
	public String unidadeSimples; //ex.:321
	public String milhares; //ex.: 654
	public String milhoes; //ex.: 987
	
	//MÉTODOS ESPECIAIS
	
	//DEMAIS MÉTODOS
	
	public String CDUSPorExtenso() {
		
		String resultado = "";
		Ordens u = new Ordens();
		
		
		
		u.unidade = unidadeSimples.charAt(2);
		u.dezena = unidadeSimples.charAt(1);
		u.centena = unidadeSimples.charAt(0);
		
		if(unidadeSimples.length() == 3) {
			
			if(u.centena != '0' && u.dezena != '0' && u.unidade != '0') {
				if(u.dezena == '1') {
					resultado = u.ODCPorExtenso() + " e " + u.ODDPorExtenso();
				}
				else {
					resultado = u.ODCPorExtenso() + " e " + u.ODDPorExtenso() + " e " + u.ODUPorExtenso();
				}
			}
			else if(u.centena == '0' && u.dezena == '0' && u.unidade != '0') {
				resultado = u.ODUPorExtenso();
			}
			else if(u.centena == '0' && u.dezena == '0' && u.unidade == '0') {
				resultado = "";
			}
			else if(u.centena == '0') {
				if(u.dezena == '1') {
					resultado = u.ODDPorExtenso();
				}
				else {
					resultado = u.ODDPorExtenso() + " e " + u.ODUPorExtenso();
				}
			}
			else if(u.centena != '0') {
				if(u.dezena == '0' && u.unidade == '0') {
					resultado = u.ODCPorExtenso();
				}
				else if(u.dezena == '0') {
					resultado = u.ODCPorExtenso() + " e " + u.ODUPorExtenso();
				}
				else if(u.dezena != '0' && u.unidade == '0') {
					resultado = u.ODCPorExtenso() + " e " + u.ODDPorExtenso();
				}
			}
			
		}
		return resultado;
	}
	
	public String CDMLPorExtenso() {
		
		
		// REPETIÇÃO DE CÓDIGO
		
		String resultado = "";
		Ordens ml = new Ordens();
		
		ml.unidade = milhares.charAt(2);
		ml.dezena = milhares.charAt(1);
		ml.centena = milhares.charAt(0);
		
		if(milhares.length() == 3) {
			
			if(ml.centena != '0' && ml.dezena != '0' && ml.unidade != '0') {
				if(ml.dezena == '1') {
					resultado = ml.ODCPorExtenso() + " e " + ml.ODDPorExtenso() + " mil ";
				}
				else {
					resultado =  ml.ODCPorExtenso() + " e " + ml.ODDPorExtenso() + " e " + ml.ODUPorExtenso() + " mil ";
				}
			}
			else if(ml.centena == '0' && ml.dezena == '0' && ml.unidade != '0') {
				if(ml.unidade == '1') {
					resultado = "mil";
				}
				else {
					resultado =  ml.ODUPorExtenso() + " mil ";
				}
			}
			else if(ml.centena == '0' && ml.dezena == '0' && ml.unidade == '0') {
				resultado = "";
			}
			else if(ml.centena == '0') {
				if(ml.dezena == '1') {
					resultado = ml.ODDPorExtenso() + " mil ";
				}
				else {
					resultado = ml.ODDPorExtenso() + " e " + ml.ODUPorExtenso() + " mil ";
				}
			}
			else if(ml.centena != '0') {
				if(ml.dezena == '0' && ml.unidade == '0') {
					resultado = ml.ODCPorExtenso() + " mil ";
				}
				else if(ml.dezena == '0') {
					resultado = ml.ODCPorExtenso() + " e " + ml.ODUPorExtenso() + " mil ";
				}
				else if(ml.dezena != '0' && ml.unidade == '0') {
					resultado = ml.ODCPorExtenso() + " e " + ml.ODDPorExtenso() + " mil ";
				}
			}
			
		}

		return resultado;
	}
	
	public String CDMPorExtenso() {
		
		// REPETIÇÃO DE CÓDIGO
		
		String resultado = "";
		Ordens m = new Ordens();
		
		m.unidade = milhoes.charAt(2);
		m.dezena = milhoes.charAt(1);
		m.centena = milhoes.charAt(0);
		
		if(milhoes.length() == 3) {
			
			if(m.centena != '0' && m.dezena != '0' && m.unidade != '0') {
				if(m.dezena == '1') {
					resultado = m.ODCPorExtenso() + " e " + m.ODDPorExtenso() + " milhões ";
				}
				else {
					resultado = m.ODCPorExtenso() + " e " + m.ODDPorExtenso() + " e " + m.ODUPorExtenso() + " milhões ";
				}
			}
			else if(m.centena == '0' && m.dezena == '0' && m.unidade != '0') {
				if(m.unidade == '1') {
					resultado =  m.ODUPorExtenso() + " milhão ";
				}
				else {
					resultado =  m.ODUPorExtenso() + " milhões ";
				}
			}
			else if(m.centena == '0' && m.dezena == '0' && m.unidade == '0') {
				resultado = "";
			}
			else if(m.centena == '0') {
				if(m.dezena == '1') {
					resultado = m.ODDPorExtenso() + " milhões ";
				}
				else {
					resultado = m.ODDPorExtenso() + " e " + m.ODUPorExtenso() + " milhões ";
				}
			}
			else if(m.centena != '0') {
				if(m.dezena == '0' && m.unidade == '0') {
					resultado = m.ODCPorExtenso() + " milhões ";
				}
				else if(m.dezena == '0') {
					resultado = m.ODCPorExtenso() + " e " + m.ODUPorExtenso() + " milhões ";
				}
				else if(m.dezena != '0' && m.unidade == '0') {
					resultado = m.ODCPorExtenso() + " e " + m.ODDPorExtenso() + " milhões ";
				}
			}
			
		}
		return resultado;
		
	}
}
