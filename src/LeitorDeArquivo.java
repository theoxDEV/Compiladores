import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class LeitorDeArquivo {

	public LeitorDeArquivo() {
		// TODO Auto-generated constructor stub
	}
	
	public List<String> lerArquivo(String nomeArquivo){
		
		String linha;
		List<String> conteudo = new ArrayList<>();
		
		try {
			FileReader leitor = new FileReader(nomeArquivo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			while ((linha = buffer.readLine()) != null) {
				conteudo.add(linha);
			}
			
			buffer.close();
			leitor.close();
			
		} catch (IOException e) {
			System.out.println("Exceção: " + e.getMessage());
		}
		
		return conteudo;
	}
	
	public void imprimirArquivo(List<String> conteudo) {
		for(String linha: conteudo) {
			System.out.println(linha);
		}
	}
}

