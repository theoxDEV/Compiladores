import java.util.ArrayList;
import java.util.List;

public class Compilar {
	public List<String> programa;
	public List<String> alfabeto;
	public List<String> dicionario;

	public Compilar() {
		programa = new ArrayList();
		alfabeto = new ArrayList();
		dicionario = new ArrayList();
	}
	
	public void Executar() {
		LeitorDeArquivo leitor = new LeitorDeArquivo();
		String dirbase = "src\\arquivos";
		
		try {
			programa = leitor.lerArquivo(dirbase + "\\exemplo.txt");
			alfabeto = leitor.lerArquivo(dirbase + "\\alfabeto.txt");
			dicionario = leitor.lerArquivo(dirbase + "\\dicionario.txt");
			//leitor.imprimirArquivo(programa);
			
			AnalisadorLexico lexico = new AnalisadorLexico();
			lexico.validar(programa, alfabeto);
			
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
	
}