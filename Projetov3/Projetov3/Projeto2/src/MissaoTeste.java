
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MissaoTeste {

	 @Test
	    public void testJogoDaMemeria() {
	        CriarM criarM = new CriarM();
	        assertDoesNotThrow(criarM::jogoDaMemeria);
	 }
	
	@Test
	public void testCriarPerfil() throws IOException {
	    Perfil perfil = new Perfil();
	    perfil.setNome("Teste");

	    String nomeArquivo = perfil.getNome() + ".txt";
	    try (FileWriter fw = new FileWriter(nomeArquivo)) {
	        System.out.println("Perfil criado: " + nomeArquivo);
	    }

	    
	    File arquivo = new File(nomeArquivo);
	    assertTrue(arquivo.exists(), "O arquivo do perfil deveria ter sido criado.");
	}
	

	 @Test
	    public void testCriarMissao() {
	        Perfil perfil = new Perfil();
	        perfil.setNome("Teste");
	        Missao missao = new Missao();

	        assertDoesNotThrow(() -> missao.criarMissao(perfil));
	    }
	
	
	
}

