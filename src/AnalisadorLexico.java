import java.util.List;

public class AnalisadorLexico {

	public AnalisadorLexico() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean validar(List<String> programa, List<String> alfabeto) {
		
		char letra;
		boolean achou;
		
		for(String linha: programa) {
			
			for(int i=0; i< linha.length(); i ++) {
				
				letra = linha.charAt(i);
				achou = estaNoAlfaberto(letra, alfabeto);
				
				if(!achou) {
					System.out.println("A letra" + letra + "não está no alfabeto..");
				}
			}
			
		}
		
		return true;
	}
	
	public boolean estaNoAlfaberto(char letra, List<String> alfabeto) {
		boolean resultado = false;
		String linha = alfabeto.get(0);
				
		for(int i = 0; i < linha.length(); i ++) {
			if(letra == linha.charAt(i)) {
				return true;
			}
		}
		
		return resultado;
	}

}
